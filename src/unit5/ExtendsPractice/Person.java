package unit5.ExtendsPractice;

/**
 * 包含一个或多个抽象方法的类本身必须被声明为抽象的，抽象方法还可以包含具体的数据和具体的方法
 * 即使不包含抽象方法，也可以声明为抽象类
 * 抽象类不能被实例化
 */
public abstract class Person {

    private String description;

    private String adress;

    public abstract String getDescription();

    public String getAdress(){
        return this.adress;
    }

}
