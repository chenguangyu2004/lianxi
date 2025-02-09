package BaizhanTest.Innerclass;

//测试静态内部类
 class Outer2 {
    private int a = 10;
    private static int b = 20;

    static class Inner2 {
        int age = 20;
        public void test(){
            //System.out.println(a);  静态内部类不能访问外部类的普通属性
            System.out.println(b);  //静态内部类可以访问外部类的静态属性
           
        }
    }
}
public class TestInnerClass{
    public static void main(String[] args) {
        Outer2.Inner2 inner = new Outer2.Inner2();
        inner.test();
    }
}
