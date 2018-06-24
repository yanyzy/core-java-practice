package unit5.ReflectivePractice;


import java.util.Date;

public class Test {

    public static void main(String[] args) {

    }



    /**
     * 使用newInstance创建类实例
     * 该方法调用默认构造器（没有参数的构造器），如果该类没有默认构造器，则抛异常
     */
    private static void testInstance() throws IllegalAccessException, InstantiationException {
        Class clazz = Date.class;
        Date object = (Date) clazz.newInstance();
        System.out.println(object.getTime());
    }

    /**
     * 获得class对象的三种方法
     */
    private static void testClass() throws ClassNotFoundException {
        Date d = new Date();
        System.out.println(d.getClass());
        System.out.println(d.getClass().getName());

        String className = "java.util.Date";
        Class clazz = Class.forName(className);
        System.out.println(clazz.getName());

        //class对象表示的是一种类型，这个类型不一定是类，比如int
        Class cl = int.class;
        System.out.println(cl.getName());
    }


}
