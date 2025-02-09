package BaizhanTest.TEST;
/*
     测试if单分支
     制作一个掷骰子游戏:
     1.三次之和大于15，nb
     2.三次之和在10到15之间，不错哦
     3.三次之和小于10，lj
 */
public class Testifelse_ifelse {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 6) + 1;
        int j = (int)(Math.random() * 6) + 1;
        int k = (int)(Math.random() * 6) + 1;

        int count = i + j + k;
        System.out.println(count);
        if(count >= 15){
            System.out.println("nb");
        }else if(count > 10){
            System.out.println("不错哦");
        }else{
            System.out.println("lj");
        }
    }
}
