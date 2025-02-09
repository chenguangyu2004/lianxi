package BaizhanTest.TestSuper;

public class TestSuper2 {

        public static void main(String[ ] args) {
            System.out.println("开始创建一个ChildClass对象......");
            new ChildClass1();
        }
    }
    class FatherClass1 {
        public FatherClass1() {
            System.out.println("创建FatherClass");
        }
    }
    class ChildClass1 extends FatherClass1 {
        public ChildClass1() {
            System.out.println("创建ChildClass");
        }


}
