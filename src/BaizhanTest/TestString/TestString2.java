package BaizhanTest.TestString;

public class TestString2 {
    public static void main(String[] args) {
        /** 使用String进行字符串的拼接*/
        /**String str8 = "";

        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();//获取系统的当前时间
        for(int i = 0;i < 5000;i++){
            str8 = str8 + i;//相当于产生了5000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 ： " + (num1 - num2));
        System.out.println("String占用时间 ： " + (time2 - time1));  */

        /** 使用StringBuilder 进行字符串的拼接*/
        StringBuilder sb1 = new StringBuilder(" ");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for(int i = 0;i < 5000;i++){
            sb1.append(i);        //append方法将指定的字符或字符串追加到现有字符串的末尾
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("String占用内存 ： " + (num3 - num4));
        System.out.println("String占用时间 ： " + (time4 - time3));
    }
}
