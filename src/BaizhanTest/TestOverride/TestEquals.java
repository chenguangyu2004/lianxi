package BaizhanTest.TestOverride;

import java.util.Objects;

public class TestEquals {
    public static void main(String[ ] args) {
        Person1 p1 = new Person1(123,"高淇");
        Person1 p2 = new Person1(123,"高小七");
        System.out.println(p1==p2);   //false，不是同一个对象
        System.out.println(p1.equals(p2)); //true，id相同则认为两个对象内容相同
        String s1 = new String("尚学堂");
        String s2 = new String("尚学堂");
        System.out.println(s1==s2);         //false, 两个字符串不是同一个对象
        System.out.println(s1.equals(s2)); //true,  两个字符串内容相同
    }
}
class Person1 {
    int id;
    String name;
    public Person1(int id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
