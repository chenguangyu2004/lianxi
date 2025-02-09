package Container;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();


        //添加元素
        boolean flag1 = list.add("oldlu");
        boolean flag2 = list.add("yu");

        // 向指定位置添加元素
        list.add(0,"sxt");
        System.out.println(list);

        System.out.println("获取元素");
        String s = list.get(1);
        System.out.println(s);

        System.out.println("获取所有元素方式");
        for(String str: list){
            System.out.println(str);
        }

        System.out.println("元素的替换");
        System.out.println(list.set(1,"kevin"));//返回替换前的元素
        System.out.println(list);

        System.out.println("根据索引位置删除元素");
        String remove = list.remove(1);//返回删除的元素
        System.out.println(remove);
        System.out.println(list);

        System.out.println("查找元素第一次在容器出现的位置索引");
        System.out.println(list.indexOf("sxt"));

        System.out.println("查找元素最后一次在容器出现的位置索引");
        list.add("sxt");
        System.out.println(list.lastIndexOf("sxt"));
    }
}
