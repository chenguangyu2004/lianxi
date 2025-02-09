package BaizhanTest.DuoTai;

public class Animal {
    public void Eat(){
        System.out.println("动物要吃饭");
    }
}


class Dog extends Animal {
    @Override
    public void Eat(){
        System.out.println("狗要吃肉");
    }
}

class Rabbit extends Animal {
    @Override
    public void Eat(){
        System.out.println("兔子要吃青草");
    }
}