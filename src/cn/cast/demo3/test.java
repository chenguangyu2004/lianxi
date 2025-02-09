package cn.cast.demo3;

//增强for循环的快捷键：iter——>回车
//增强for循环的底层依赖迭代器


import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = new ArrayList() ;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(Object obj: list){
            System.out.println(obj);
        }

    }
}
