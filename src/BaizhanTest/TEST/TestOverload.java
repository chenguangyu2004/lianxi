package BaizhanTest.TEST;

public class TestOverload {
    public static void main(String[ ] args) {
        System.out.println(add(3, 5));// 8
        System.out.println(add(3, 5, 10));// 18
        System.out.println(add(3.0, 5));// 8.0
        System.out.println(add(3, 5.0));// 8.0
    }
    /** 求和的方法 */
    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    // 方法名相同，参数个数不同，构成重载
    public static int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }
    // 方法名相同，参数类型不同，构成重载
    public static double add(double n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }
    // 方法名相同，参数顺序不同，构成重载
    public static double add(int n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }

}
