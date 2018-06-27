package unit5.enumPractice;

import java.util.Arrays;

/**
 * 枚举类型
 * 比较时可以直接==
 */
public enum Size {
    SMALL, LARGE;
}

class Test {

    public static void main(String[] args) {
        System.out.println(Size.SMALL.toString());

        Size s = Enum.valueOf(Size.class,"SMALL");

        System.out.println(Arrays.toString(Size.values()));

        System.out.println(Size.SMALL.compareTo(Size.LARGE));
    }

}
