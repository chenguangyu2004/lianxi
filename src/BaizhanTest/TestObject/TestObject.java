package BaizhanTest.TestObject;

import java.sql.SQLOutput;

public class TestObject extends Object{
    String name;
    String zhanghu;

    @Override
    public String toString() {
        return "姓名{" +
                "name='" + name + '\'' +
                ", 账号='" + zhanghu + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TestObject t = new TestObject();
        System.out.println(t.toString());
        System.out.println(t);             //默认调用toString方法

    }
}
