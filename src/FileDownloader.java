import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloader implements IDownloader {
    @Override
    public void download(String userAgent, String url, String dest) {
        try {
            URLConnection urlConnection = new URL(url).openConnection();
            urlConnection.setRequestProperty("User Agent", userAgent);
            urlConnection.setUseCaches(false);
            Files.copy(urlConnection.getInputStream(), Paths.get(dest));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
