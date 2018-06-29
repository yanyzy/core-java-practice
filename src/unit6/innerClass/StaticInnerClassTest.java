package unit6.innerClass;

/**
 * @author zhyee
 * @date 2018/6/29 下午10:22
 */
public class StaticInnerClassTest {

    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i=0;i<d.length;i++){
            d[i] = Math.random();
        }

        ArrayAlg.Pair pair = ArrayAlg.minMax(d);
        System.out.println("first : "+ pair.getFirst());
        System.out.println("second : "+ pair.getSecond());
    }
}

class ArrayAlg {
    /**
     * 在内部类不需要访问外围类对象时，应该使用静态内部类
     * 静态内部类除了没有对生成他的外围类对象的引用权，与其他所有内部类完全一样
     */
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public void setFirst(double first) {
            this.first = first;
        }

        public double getSecond() {
            return second;
        }

        public void setSecond(double second) {
            this.second = second;
        }
    }

    public static Pair minMax(double[] doubles) {
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        for (double d : doubles) {
            if (min > d) min = d;
            if (max < d) max = d;
        }
        return new Pair(min, max);
    }
}
