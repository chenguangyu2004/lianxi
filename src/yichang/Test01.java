package yichang;

//处理运行时异常和处理方式（RunTimeException）
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(111);
        try {
            int a = 1/0;
        }catch(Exception e){
            e.printStackTrace();//打印错误信息
        }
        //解决ArithmeticException异常：试图除以0
        int b=0;
        if(b!=0){
            System.out.println(1/b);
        }
        //解决NullPointerException异常
        String str=null;
        if(str!=null){
            System.out.println(str.charAt(0));
        }
        //解决ClassCastException异常
        Animal a = new Dog();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
        }

        //解决ArrayIndexOutOfBoundsException异常
        int[ ] arr = new int[5];
        int c = 5;
        if (c < arr.length) {
            System.out.println(arr[c]);
        }

        //解决NumberFormatException异常
        String str1 = "1234abcf";
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str1);
        if (m.matches()) { // 如果str匹配代表数字的正则表达式,才会转换
            System.out.println(Integer.parseInt(str1));
        }


        System.out.println(222);
    }
}

class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
