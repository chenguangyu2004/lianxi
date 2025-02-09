package BaizhanTest.TestInterface;

import BaizhanTest.TEST.TestStatic;

public class TestInterface {
    public static void main(String[] args) {
        Angel a1 = new Angel();
        a1.Fly();
        a1.HelpOthers();
        System.out.println("---------------");
        Volant a2 = new Angel();
        a2.Fly();
        System.out.println("---------------");
        Honest a3 = new Angel();
        a3.HelpOthers();
        System.out.println("=====测试默认方法======");
        TestDefault td = new TestDefaultImpl01();
        td.moren();
        td.printInfo();
        System.out.println("=====测试静态方法======");
        TestDefault.TestStatic01();
        TestDefaultImpl01.TestStatic01();
    }
}
