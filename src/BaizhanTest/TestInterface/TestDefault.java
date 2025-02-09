package BaizhanTest.TestInterface;

public interface TestDefault {

    //测试接口中的新特性（默认方法，静态方法）
    void printInfo();
    default void moren(){
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法");
    }
    public static void TestStatic01(){
        System.out.println("TestDefault.TestStatic01");
    }
}

class TestDefaultImpl01 implements TestDefault{
    @Override
    public void printInfo() {

    }

    @Override
    public void moren() {
        TestDefault.super.moren();
    }
    public static void TestStatic01(){
        System.out.println("TestDefaultImpl01.TestStatic01");
    }
}