package BaizhanTest.ShuZu;
//使用javaBean和数组保存表格数据
public class Test05 {
    public static void main(String[] args) {
         Emp[] emp = {
                 new Emp(1001,"高淇",18,"讲师","2-14"),
                 new Emp(1002,"高小七",19,"助教","10-10"),
                 new Emp(1003,"高小八",20,"班主任","5-5")
        };

         for(Emp e:emp){
             System.out.println(e);
         }
    }
}
