package cn.cast.demo1;

public class test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b)); // 算术运算符
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("++a = " + (++a)); // 自增运算符
        System.out.println("--b = " + (--b)); // 自减运算符

        int c = 5;
        c += 3; // 赋值扩展运算符
        System.out.println("c += 3 -> " + c);

        int d = 10;
        int e = 11;
        System.out.println("d < e -> " + (d < e)); // 关系运算符
        System.out.println("d > e -> " + (d > e));
        System.out.println("d <= e -> " + (d <= e));
        System.out.println("d >= e -> " + (d >= e));
        System.out.println("d != e -> " + (d != e));
        System.out.println("d == e -> " + (d == e));

        boolean f = true;
        boolean g = false;
        System.out.println("f && g -> " + (f && g)); // 逻辑运算符
        System.out.println("f || g -> " + (f || g));
        System.out.println("!f -> " + (!f));

        int h = 5; // 二进制表示为 0101
        int i = 3; // 二进制表示为 0011
        System.out.println("h & i -> " + (h & i)); // 位运算符
        System.out.println("h | i -> " + (h | i));
        System.out.println("h ^ i -> " + (h ^ i));

        int j = 10;
        int k = 20;
        int result = (j > k) ? j : k; // 条件运算符
        System.out.println("max(j, k) -> " + result);

        String l = "Hello";
        String m = "World";
        String n = l + " " + m; // 字符串连接符
        System.out.println("l + m -> " + n);
    }
}
