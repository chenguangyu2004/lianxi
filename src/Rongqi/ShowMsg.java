package Rongqi;

public class ShowMsg {
    //输出Generic对象中的flag值
    public void showFlag(Generic<?> generic){
        System.out.println(generic.getFlag());
    }
}
