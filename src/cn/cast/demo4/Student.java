package cn.cast.demo4;

import java.util.Objects;

public class Student {
    //成员变量
    private String name;
    private int age;
    //构造方法
    public Student(){
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    //成员方法
    public void getName(){
        this.name = name;
    }
    public String setName(){
        return name;
    }
   public void getAge(){
        this.age = age;
   }
   @Override
   public String toString(){
        return "Student{" + name + "," + age + "}";
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
