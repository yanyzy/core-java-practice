package unit6.proxyPractice;

/**
 * 电影
 * @author zhyee
 * @date 2018/6/29 下午11:17
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("您正在观看电影 《肖生克的救赎》");
    }
}
