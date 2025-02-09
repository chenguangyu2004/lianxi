package Container;
/*框架总体结构
最顶层是 Collection接口,定义了集合的基本操作。
然后分为 List、Set、Queue 等子接口,分别定义了有序、无序、队列等特性。
再通过 AbstractList、AbstractSet 等抽象类为子接口提供部分方法实现。
最后是具体的实现类,如 ArrayList、LinkedList、HashMap等。     */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
         ArrayList list  = new ArrayList();   //调用方法多，但是换容器麻烦
        List<String> list2 = new ArrayList<>();
        //Collection list3 = new ArrayList();   方法太少

        //添加元素
        boolean flag1 = list.add("oldlu");
        boolean flag2 = list.add("yu");
        boolean flag3 = list.add("yu");
        System.out.println(flag1 + "\t" + flag2 + "\t");
        System.out.println(list);

        //将ArrayList转换成数组
        Object[] objects = list.toArray(); //list.toArray()作用：方便地输出数组,这个方法是是用来将数组转换成String类型输出的，入参可以是long，float，double，int，boolean，byte，object型的数组。
        System.out.println(Arrays.toString(objects));

        //删除元素
        list.remove("oldlu");
        System.out.println(list);

        //获取元素个数，int型
        System.out.println(list.size());

        //判断容器是否为空,boolean型
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());

        //判断容器中是否有指定元素,boolean型
        System.out.println(list.contains("yu"));

        list.clear();

        System.out.println(list);
    }
}
