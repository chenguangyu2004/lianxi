package cn.cast.demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class diedaiqitest {
    public static void main(String[] args) {
        List list = new ArrayList() ;
        list.add("a");
        list.add("b");
        //迭代器的用法
        //1.根据集合对象获取其对象的迭代器对象
        Iterator it = list.iterator() ;
        //2.判断迭代器中是否有元素
       while(it.hasNext() ) {
           //3.如果有就获取元素
       String s =(String)it.next();
           System.out.println(s);
       }
    }
}
