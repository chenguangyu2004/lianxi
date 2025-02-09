package BaizhanTest.ShuZu;
//数组的创建和声明

public class Test01 {
    public static void main(String[] args) {
        int s[ ];           //声明
        s = new int [10];   //创建

        //动态初始化
        for(int i = 0;i<10;i++){
            s[i] = 2 * i + 1;
        }
        for(int i = 0;i<10;i++){
            System.out.print(s[i]);
            System.out.print(" ");
            if(i == 9) System.out.println(" ");
        }

        Man[] mans = new Man[10];
        Man m1 = new Man(1,10);
        Man m2 = new Man(2,20);

        mans[0] = m1;
        System.out.println(mans[0].getAge());
        System.out.println(mans[0].getId());
    }
}

       class Man{
         private int age;
         private int id;
         public Man(int id,int age) {
         super();
         this.age = age;
         this.id = id;
       }

           public int getAge() {
               return age;
           }

           public void setAge(int age) {
               this.age = age;
           }

           public int getId() {
               return id;
           }

           public void setId(int id) {
               this.id = id;
           }
       }
