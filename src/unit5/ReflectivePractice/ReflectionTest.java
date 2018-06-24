package unit5.ReflectivePractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 利用反射打印出类的所有特征
 */
public class ReflectionTest {

    public static void main(String[] args) {
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("enter class name: ");
            name = in.next();
        }

        try {
            Class clazz = Class.forName(name);
            Class superClazz = clazz.getSuperclass();
            String modifiers = Modifier.toString(clazz.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superClazz != null && superClazz != Object.class) {
                System.out.print(" extends " + superClazz);
            }
            System.out.print("\n{\n");

            printFields(clazz);
            System.out.println( );
            printConstructors(clazz);
            System.out.println();
            printMethod(clazz);
            System.out.println("}");

        } catch (ClassNotFoundException e) {
            System.out.println("找不到这个类");
        }

        System.exit(0);

    }

    /**
     * 打印构造函数
     *
     * @param clazz
     */
    private static void printConstructors(Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.println();
            String name = constructor.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            Class[] paramTypes = constructor.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[i].getName());
            }

            System.out.print(")");
        }
    }

    /**
     * 打印声明的方法
     *
     * @param clazz
     */
    private static void printMethod(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println();
            String modifiers = Modifier.toString(method.getModifiers());
            Class returnType = method.getReturnType();

            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + method.getName() + "(");
            Class[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.print(")");
        }
    }

    /**
     * 打印类中声明的域
     *
     * @param clazz
     */
    private static void printFields(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println();
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print(field.getType().getName() + " " + field.getName());
        }
    }
}
