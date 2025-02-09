package changyonglei;
//测试包装类的使用

public class TestInteger {
    public static void main(String[] args) {
        Integer i = new Integer(59);  //java9就废弃了
        Integer j = Integer.valueOf(66);   //官方推荐

        int a = j.intValue();   //把包装类对象转换成基本数据类型
        double b = j.doubleValue();

        //把字符串转换成数字
        Integer m = Integer.valueOf("456");

        //测试自动装箱和拆箱
        Integer x = 100;//  编译器：Integer x = Integer.ValueOf(100);
        int y =x;       //  编译器：int y = x.intValue();

        Integer z = null;
        //int z2 = z;     //  编译器：int z2 = z.intValue();      //NullPointerException

        //测试缓存机制问题
        Integer x1 =  100;
        Integer x2 = 100;
        Integer x3 = 100;
        Integer x4 = 100;
        System.out.println(x1==x2);
        System.out.println(x3==x4);    //1000不在缓存范围内
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));

    }
}
