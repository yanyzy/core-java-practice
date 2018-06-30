package unit6.proxyPractice;

/**
 * 代理类，增加了广告
 * @author zhyee
 * @date 2018/6/29 下午11:18
 */
public class Cinema implements Movie {
    RealMovie movie;

    public Cinema(RealMovie movie) {
        super();
        this.movie = movie;
    }

    @Override
    public void play() {

        advertising(true);

        movie.play();

        advertising(false);
    }

    private void advertising(boolean start) {
        if (start) {
            System.out.println("电影马上开始了，买爆米花吧");
        } else {
            System.out.println("电影马上结束了，买爆米花吧");
        }
    }
}
