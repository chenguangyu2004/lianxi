package BaizhanTest.TestInterface;


//飞行接口
public interface Volant {
    /*public static final*/ int Fly_Height = 100;
    /*public abstract*/ void Fly();
}

//善良接口
interface Honest{
    void HelpOthers();
}

  class GoodMan implements Honest{
    @Override
    public void HelpOthers(){
        System.out.println("帮助别人");
    }
}

class BirdMan implements Volant{
    @Override
    public void Fly(){
        System.out.println("鸟人会飞");
    }
}

class Angel implements Volant,Honest{
    @Override
    public void HelpOthers() {
        System.out.println("天使很善良");
    }

    @Override
    public void Fly() {
        System.out.println("天使会飞");
    }
}
