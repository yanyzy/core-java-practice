package unit6.clonePractice;

import java.util.Date;
import java.util.List;

/**
 * @author zhyee
 * @date 2018/6/27 下午9:21
 */
public class Teacher implements Cloneable {
    private String name;
    private int age;
    private Date birthday;
    private List<String> courses;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Teacher(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 把方法访问权限扩展为public
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Teacher clone() throws CloneNotSupportedException {
        return (Teacher) super.clone();
    }
}
