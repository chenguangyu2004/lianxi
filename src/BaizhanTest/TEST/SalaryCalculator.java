package BaizhanTest.TEST;
/**
   薪水计算器：
   (1) 通过键盘输入用户的月薪，每年是几个月薪水。
   (2) 输出用户的年薪
   (3) 输出一行字如果年薪超过10万，恭喜你超越90%的国人，如果年薪超过20万，恭喜你超越98%的国人。
   (4) 键盘输入数字88，则退出程序（使用break退出循环）
   (5) 键盘输入66，直接显示重新开始计算...，然后算下一个用户的年薪。
 */
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*********薪水计算器********");
        while(true) {
            System.out.print("请输入月薪:");
            int MonthSalary = s.nextInt();
            System.out.print("请输入每年是几个月月薪：");
            int Months = s.nextInt();
            int YearSalary = Months * MonthSalary;
            System.out.println("年薪为" + YearSalary);

            if (MonthSalary >= 200000) {
                System.out.println("恭喜超越98%的国人");
            } else if (MonthSalary > 100000) {
                System.out.println("恭喜超越90%的国人");
            } else {
                System.out.println("请继续加油");
            }


            System.out.println("键盘输入数字88，则退出程序;\n键盘输入66，直接显示重新开始计算.");
            int input = s.nextInt();
            if(input == 88){
                System.out.println("退出程序\n");
                break;
            }else if(input == 66){
                continue;
            }
        }

    }
}
