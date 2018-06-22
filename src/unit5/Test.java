package unit5;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        testBoxing();
    }

    /**
     * boolean,byte,char<=127,介于-128~127之间的short和int会自动拆箱装箱
     * 比较包装类型最好采用equals方法
     */
    private static void testBoxing() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b);

        a = 1000;
        b = 1000;
        System.out.println(a==b);
        System.out.println(a.intValue()==b.intValue());

        a = 128;
        b = 128;
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }

    /**
     * object类默认的hashCode方法导出的是对象的存储地址
     * null安全的方法 Objects.hashCode，当参数为null,返回0
     */
    private static void testHashCode() {
        Manager manager1 = new Manager();
        manager1.setFirstName("000");
        Manager manager2 = new Manager();
        System.out.println("manager1.hashcode: " + manager1.hashCode());
        System.out.println("manager2.hashcode: " + manager2.hashCode());
        System.out.println("Objects.hash: " + Objects.hash(manager1, manager2));
        System.out.println("Objects.hashCode: " + Objects.hashCode(null));
        System.out.println(manager1);
    }

    /**
     * equals方法比较的是引用指向的地址
     */
    private static void testEquals() {
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        manager1.setFirstName("000");
        manager2.setFirstName("000");
        System.out.println(manager1.equals(manager2));
        System.out.println(manager1.getFirstName().equals(manager2.getFirstName()));
    }

    /**
     * 抽象类不可以被实例化
     */
    private static void testAbstract() {
        //Person person = new Person();//error
        Person person = new Student();
    }

    /**
     * 动态绑定机制是多态性的实现
     * 动态绑定是指，在编译期不判断对象的具体类型，在运行期判断
     * 错误的动态绑定实例，编译期不会报错，报错代码已被注释
     */
    private static void testDynamicBinding() {
        Manager[] managers = new Manager[5];
        ((Employee[]) managers)[0] = new Employee();//error
        managers[0].print();
    }

    /**
     * final类的方法自动为final方法，而不包括域
     */
    private static void testFinal() {
        Manager[] managers = new Manager[5];
        managers[1] = new Manager();
        managers[1].setFirstName("999");
        System.out.println(managers[1].getFirstName());
    }

    /**
     * 只能在继承层次内进行类型转换
     * 在将超类转换为子类前，先使用instanceof检查类型
     * 一般情况下，尽量少用类型转换和instanceof运算符
     */
    private static void testInstanceOf() {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee();
        employees[0].setName("no.1");
        employees[1] = new Manager();
        employees[1].setName("no.2");
        for (Employee e : employees) {
            if (e instanceof Manager) {
                Manager manager = (Manager) e;
                System.out.println(manager.getName());
                manager.setFirstName("hhh");
            }
        }
    }
}
