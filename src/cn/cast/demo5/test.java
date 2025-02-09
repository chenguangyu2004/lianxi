package cn.cast.demo5;

import java.io.File;

public class test {
    public static void main(String[] args) throws Exception{
        //需求：将D:\abc\1.txt封装成File对象
        //方式一
        //File file = new File("D:\\abc\\1.txt");
        File file = new File("D:/abc/1.txt");

        //方式二
        File file2 = new File("D:/abc","1.txt");

        //方式三
        File file3 = new File("D:/abc");
        File file4 = new File(file3,"1.txt");

        //创建一个文件
        File file5 = new File("d:/2.txt");
        boolean flag = file5.createNewFile();

        //创建一个文件夹
        File file6 = new File("d:/a");
        boolean flag1 = file6.mkdir();
        System.out.println(Math.round(3.6));
    }

}
