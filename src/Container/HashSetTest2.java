package Container;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) {
        //实例化HashSet容器
        Set<Users> set = new HashSet<>();

        //实例化Users
        Users u1 = new Users("yu",18);
        Users u2 = new Users("yu",20);

        //添加到容器中
        set.add(u1);
        set.add(u2);

        //遍历容器
        for(Users u:set){
            System.out.println(u);
        }
    }
}
