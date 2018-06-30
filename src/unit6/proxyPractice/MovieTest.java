package unit6.proxyPractice;

/**
 * @author zhyee
 * @date 2018/6/29 下午11:22
 */
public class MovieTest {
    public static void main(String[] args) {
        RealMovie movie = new RealMovie();

        Movie movie1 = new Cinema(movie);

        movie1.play();
    }
}
