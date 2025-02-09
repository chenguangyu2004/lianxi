package Rongqi;

public class MethonGeneric {

    public <T> void method(T ...args){
        for(T t:args){
            System.out.print(t);
        }
        System.out.println();
    }
    public static  <T> T aa(){
        return null;
    }
    public <T> void setName(T name){
        System.out.println(name);
    }
    public <T> T getAge(T age){
        return age;
    }

}
