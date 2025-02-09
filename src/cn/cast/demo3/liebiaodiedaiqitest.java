package cn.cast.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class liebiaodiedaiqitest {
    public static void main(String[] args) {
        List list = new ArrayList() ;
        list.add("a");
        list.add("b");
        //迭代器的用法
        //1.根据集合对象获取其对象的迭代器对象
        ListIterator lit = list.listIterator() ;
        //2.判断迭代器中是否有元素
        while(lit.hasNext() ) {
            //3.如果有就获取元素
            String s =(String)lit.next();
            if("b".equals(s) ){
                //list.add("java");  //报错（并发报错）
                lit.add("java");
            }
            System.out.println(list);
        }
    }
}
