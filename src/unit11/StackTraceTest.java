package unit11;


import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 打印递归的堆栈情况
 *
 * @author zhyee
 * @date 2018/6/30 下午1:46
 */
public class StackTraceTest {

    public static int factorial(int n) {
        System.out.println("factorial(" + n + ") : ");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement s : frames) {
            System.out.println(s);
        }
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        Logger.getGlobal().info("测试-----");
        return r;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = in.nextInt();
        factorial(n);

    }
}
