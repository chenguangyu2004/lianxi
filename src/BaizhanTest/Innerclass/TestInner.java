package BaizhanTest.Innerclass;

public class TestInner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();

        inner.show();
    }
}
