package unit12;

/**
 * 定义一个泛型类
 * 泛型类是指具有一个或多个类型变量的类
 * 虚拟机没有泛型类型对象，所有类型都属于普通类
 *
 * @author zhyee
 * @date 2018/7/1 下午9:13
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
