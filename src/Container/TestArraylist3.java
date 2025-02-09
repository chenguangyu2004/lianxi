package Container;

import java.util.ArrayList;
import java.util.List;

public class TestArraylist3 {
    public static void main(String[] args) {
        //并集操作：将一个容器融入另一个容器
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        System.out.println(a);

        List<String> b = new ArrayList<>();
        b.add("c");
        b.add("d");
        System.out.println(b);

        //a并集b
        a.addAll(b);
        for(String str : a){
            System.out.println(str);
        }
        System.out.println("---------------");
        //交集操作：保留相同，删除不同
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");

        List<String> b1 = new ArrayList<>();
        b1.add("b");
        b1.add("d");
        //交集操作
        a1.retainAll(b1);
        for(String str : a1){
            System.out.println(str);
        }
        System.out.println("---------------");
        //差集操作：保留不同的，删除不同的
        List<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");

        List<String> b2 = new ArrayList<>();
        b2.add("b");
        b2.add("d");
        //交集操作
        a2.removeAll(b2);
        for(String str : a2){
            System.out.println(str);
        }
    }
}
