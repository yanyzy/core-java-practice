package unit6.proxyPractice.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试方法
 *
 * @author zhyee
 * @date 2018/6/30 下午12:12
 */
public class MainTest {

    public static void main(String[] args) {
        MaoTai maoTai = new MaoTai();

        InvocationHandler handler = new Counter(maoTai);
        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaoTai.class.getClassLoader(),
                MaoTai.class.getInterfaces(), handler);

        dynamicProxy.AllowToSell();

    }
}
