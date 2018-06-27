package unit6.clonePractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhyee
 * @date 2018/6/27 下午9:19
 */
public class CloneTest {

    /**
     * 如果teacher对象没有实现cloneable接口。则会抛出CloneNotSupportedException异常
     * 没有重写clone方法，此拷贝为浅拷贝
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher1 = new Teacher("zz",30,new Date(2012,11,1));
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("chinese");
        stringList1.add("english");
        teacher1.setCourses(stringList1);

        Teacher teacher2 = teacher1.clone();
        teacher2.setAge(40);
        teacher2.setName("ii");
        teacher2.setBirthday(new Date(2011,2,2));
        List<String> stringList2 = teacher2.getCourses();
        stringList2.add("math");

        System.out.println(teacher1.getAge());
        System.out.println(teacher2.getAge());

        System.out.println(teacher1.getName());
        System.out.println(teacher2.getName());

        System.out.println(teacher1.getBirthday());
        System.out.println(teacher2.getBirthday());

        //修改了teacher2之后，teacher1也被修改了
        System.out.println(teacher1.getCourses());
        System.out.println(teacher2.getCourses());
    }
}
