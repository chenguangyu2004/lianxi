package BaizhanTest.DuoTai;

public class Test {
    public static void main(String[] args) {
        animalEat(new Dog());
        animalEat(new Rabbit());
        animalEat(new Animal());

    }
    static void animalEat(Animal a){
        a.Eat();
    }
}
