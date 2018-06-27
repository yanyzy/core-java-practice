package unit5.extendsPractice;

public class Employee {

    private String name;

    private int age;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
