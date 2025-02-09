package Container;

import java.util.LinkedList;

public class TestLinkedList2 {
    public static void main(String[] args) {

        //实例化linkedList容器
        LinkedList<String> list = new LinkedList<>();

        //将指定元素插入到开头
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        for(String str: list){
            System.out.print(str + " ");
        }
        System.out.println();

        //将指定元素插入到开头结尾
        list.addLast("a");
        list.addLast("c");
        list.addLast("b");
        for(String str: list){
            System.out.print(str + " ");
        }
        System.out.println();

        //返回列表的第一个元素
        System.out.println(list.getFirst());
        //返回列表的最后一个元素
        System.out.println(list.getLast());
    }
}
