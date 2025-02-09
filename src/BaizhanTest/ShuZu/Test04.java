package BaizhanTest.ShuZu;

import java.util.Arrays;

//测试Object二维数组
public class Test04 {
    public static void main(String[] args) {

        Object[] a1 = {"王宣岳",19,"数学社社长"};
        Object[] a2 = {"江剑雄",20,"数学社副社长"};
        Object[] a3 = {"余姚 ",19,"数学社宣传部部长"};
        Object[] a4 = {"陈广虞",20,"数学社宣传部副部"};

        Object[][] emps =new Object[4][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        emps[3] = a4;

        System.out.println(Arrays.toString(emps[0]) );
        System.out.println(Arrays.toString(emps[1]) );
        System.out.println(Arrays.toString(emps[2]) );
        System.out.println(Arrays.toString(emps[3]) );
        System.out.println("======================= ");
        for(int i=0;i<emps.length;i++){
            for(int j=0;j<emps[i].length;j++){
                System.out.print(emps[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
