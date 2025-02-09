package BaizhanTest.ShuZu;
//测试遍历
public class Test03 {
    public static void main(String[] args) {
        String[]  cities =  {"上海","无锡","泰州","南昌","武汉"};
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]);
        }

        //for-each 只能用于简单的遍历
        for (String t:cities){
            System.out.println(t);
        }
    }
}
