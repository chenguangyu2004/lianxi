package BaizhanTest.ExtendsTest;

public class Test1{
    public static void main(String[ ] args) {
        Student s = new Student("高淇",176,"Java");
        s.rest();
        s.study();
    }
}
class Person {
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}
class Student extends Person {
    String major; //专业
    public void study(){
        System.out.println("在尚学堂，学习Java");
    }
    public Student(String name,int height,String major) {
        //天然拥有父类的属性
        this.name = name;
        this.height = height;
        this.major = major;
    }
}

