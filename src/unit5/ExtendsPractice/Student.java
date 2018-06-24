package unit5.ExtendsPractice;

/**
 * 子类方法必须实现父类的所有抽象方法，否则子类必须声明为抽象类
 */
public class Student extends Person {
    @Override
    public String getDescription() {
        return null;
    }
}
