package BaizhanTest.TestOverride;

/**
 * 测试方法重写
 */
public class TestOverride01 {
    public static void main(String[] args) {
         Horse h = new Horse();
         Plane p = new Plane();
         h.run() ;
         h.getvechile();
         p.run();
    }
}
class Vechile{   //交通工具类
    public void run(){
        System.out.println("按自己的方式运行");
    }

    public Vechile getvechile(){
        System.out.println("给你一个交通工具");
        return null;
    }

}
class Horse extends Vechile{  //🐎类
    @Override
    public void run(){
        System.out.println("得得得得");
    }

    @Override
    public Horse getvechile() {
        System.out.println("给你一匹马");
        return new Horse();
    }
}

class Plane extends Vechile{
    @Override
    public void run(){
        System.out.println("fly");
    }
}
