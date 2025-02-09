package Container;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {
    public static void main(String[] args) {
        //实例化HashSet容器    Set容器特点：无序，不可重复
        Set<String> set = new HashSet<>();
        //添加元素
        set.add("a");
        set.add("a1");
        set.add("b1");
        set.add("a");
        System.out.println(set);

        //获取元素：在Set接口类型的的容器中，并没有提供指定位置的元素的方法
        for(String str:set){
            System.out.println(str);
        }
        System.out.println("-------------");

        //删除元素
        set.remove("a");
        System.out.println(set);
    }
}
