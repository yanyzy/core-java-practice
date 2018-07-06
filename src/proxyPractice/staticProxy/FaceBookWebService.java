package proxyPractice.staticProxy;

/**
 * @author zhyee
 * @date 2018/7/6 下午9:53
 */
public class FaceBookWebService implements WebService {
    @Override
    public void acceptRequest() {
        System.out.println("FaceBook接收到请求并返回数据...");
    }
}
