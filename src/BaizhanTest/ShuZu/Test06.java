package BaizhanTest.ShuZu;

import java.util.Arrays;

//测试Comparable接口
public class Test06 {
    public static void main(String[] args) {
           Man2[] man2 = {new Man2(2,"a"),new Man2(15,"b"),new Man2(50,"c")};
          Arrays.sort(man2);
           System.out.println(Arrays.toString(man2));
    }
}
class Man2 implements Comparable{
    int age;

    String name;

    public Man2() {
    }

    public Man2(int age,  String name) {
        this.age = age;

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Man2 man2 = (Man2) o;
        if(this.age < man2.age)  return 1;
        if(this.age > man2.age)  return -1;
        return 0;
    }
}
