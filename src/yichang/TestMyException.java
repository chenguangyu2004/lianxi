package yichang;

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if(age<0){
            throw new IllegalAgeException("nm放屁");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}


public class TestMyException {
    public static void main(String[ ] args) {
        Person p = new Person();
        try {
            p.setName("chen");
            p.setAge(-1);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p);
    }
}

