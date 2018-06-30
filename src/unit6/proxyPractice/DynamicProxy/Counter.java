package unit6.proxyPractice.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 柜台类
 *
 * @author zhyee
 * @date 2018/6/30 下午12:07
 */
public class Counter implements InvocationHandler {
    private Object brands;

    public Counter(Object brands) {
        this.brands = brands;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("销售开始，柜台是 ： " + this.getClass().getSimpleName());
        method.invoke(brands, args);
        System.out.println("销售结束");
        return null;
    }
}
