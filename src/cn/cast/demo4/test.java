package cn.cast.demo4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args){
        //1.创建集合对象
        Set <Student > set = new HashSet <>();
        //2.创建元素对象
        Student s1 = new Student("猫",16);
        Student s2 = new Student("狗",19);
        Student s4 = new Student("猫",16);
        Student s3 = new Student("鼠",18);
        //3.将集合对象添加到元素对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        //4.遍历集合
        for (Student student : set) {
            System.out.println(set);
        }


    }
}
