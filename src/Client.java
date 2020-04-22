public class Client {
    public static void main(String[] args) {
        String url = "https://data25.chiasenhac.com/downloads/2079/2/2078657-ec15e98b/128/Tinh%20Sau%20Thien%20Thu%20Muon%20Loi%20-%20Doan%20Hieu.mp3";
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36";
        String destination = "linh.mp5";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}
