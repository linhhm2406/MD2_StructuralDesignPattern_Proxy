import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloaderProxy implements IDownloader {
    @Override
    public void download(String userAgent, String url, String dest) {
        FileDownloader fileDownloader = new FileDownloader();
        fileDownloader.download(userAgent, url, dest);
    }
}
