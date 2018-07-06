package proxyPractice.staticProxy;

/**
 * @author zhyee
 * @date 2018/7/6 下午10:00
 */
public class ProxyWebService implements WebService {

    private FaceBookWebService faceBookWebService;

    public ProxyWebService(FaceBookWebService faceBookWebService) {
        this.faceBookWebService = faceBookWebService;
    }

    @Override
    public void acceptRequest() {
        System.out.println("代理服务器接收到请求并转发...");
        faceBookWebService.acceptRequest();
        System.out.println("代理服务器获取响应数据并返回...");
    }
}
