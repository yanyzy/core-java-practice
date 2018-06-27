package unit5.reflectivePractice;


import unit5.extendsPractice.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        testInvoke();
    }


    /**
     * Method.invoke可以调用某个类的该方法
     * 当方法为静态方法，第一个参数为null
     */
    private static void testInvoke() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method setAge = Employee.class.getMethod("setAge",int.class);
        Method getAge = Employee.class.getDeclaredMethod("getAge");
        Employee employee = Employee.class.newInstance();
        setAge.invoke(employee,10);
        System.out.println("age= "+getAge.invoke(employee));
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
