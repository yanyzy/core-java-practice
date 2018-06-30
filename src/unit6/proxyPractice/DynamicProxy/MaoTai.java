package unit6.proxyPractice.DynamicProxy;

/**
 * @author zhyee
 * @date 2018/6/30 下午12:07
 */
public class MaoTai implements SellWine {
    @Override
    public void AllowToSell() {
        System.out.println("这里是茅台酒");
    }
}
