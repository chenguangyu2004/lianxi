package BaizhanTest.ShuZu;
//测试数组的三种方式
public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        Man[] mans = {new Man(1,20),new Man(2,20)};
        System.out.println(mans[0].getAge());
        System.out.println(mans[0].getId());

        //动态初始化
        int s[ ];           //声明
        s = new int [10];   //创建
        for(int i = 0;i<10;i++){
            s[i] = 2 * i + 1;
        }


    }
}
