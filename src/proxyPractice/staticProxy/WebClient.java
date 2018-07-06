package proxyPractice.staticProxy;

/**
 * @author zhyee
 * @date 2018/7/6 下午10:03
 */
public class WebClient {

    public static void main(String[] args) {
        FaceBookWebService faceBookWebService = new FaceBookWebService();
        ProxyWebService proxyWebService = new ProxyWebService(faceBookWebService);
        proxyWebService.acceptRequest();
    }
}
