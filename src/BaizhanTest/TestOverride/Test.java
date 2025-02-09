package BaizhanTest.TestOverride;

public class Test{
    public static void main(String[ ] args) {
        Student s = new Student("高淇",172,"Java");
        s.person.rest();   //s.rest();
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


class Student /*extends Person*/ {
    Person person = new Person();
    String major; //专业


    public Student(String name,int height,String major) {
        //拥有父类的对象，通过这个对象间接拥有它的属性和方法
        this.person.name = name;   //this.name = name;
        this.person.height = height;   //this.height = height;
        this.person.rest();


        this.major = major;}
    public void study(){
        System.out.println("学习:");
        person.rest();
        System.out.println(this.person.name);
    }
}


