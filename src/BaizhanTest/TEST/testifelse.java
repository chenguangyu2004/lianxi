package BaizhanTest.TEST;
/*
     测试ifelse分支

 */
public class testifelse {
    public static void main(String[] args) {
        double r = 4 * Math.random();
        double area = Math.PI * r * r;
        double circle = Math.PI * r * 2;
        if(circle >=area){
            System.out.println("2 >= r");
        }else{
            System.out.println("2 < r");
        }
    }
}
