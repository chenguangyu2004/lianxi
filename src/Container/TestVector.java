package Container;

import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        //实例化Vector容器
        List<String> a = new Vector<>();
        a.add("a");
        a.add("b");
        for (String str : a) {
            System.out.println(str);
        }
    }
}
