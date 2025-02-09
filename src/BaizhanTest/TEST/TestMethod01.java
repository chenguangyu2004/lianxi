package BaizhanTest.TEST;

public class TestMethod01 {
        /**
         * (1)输入参数：迟到时间，月薪。
         * (2)处理逻辑：
         * ①迟到1-10分钟，警告。
         * ②迟到11-20分钟，罚款100元。
         * ③迟到21分钟-30分钟，罚款200元。
         * ④迟到30分钟以上，扣除半日工资。
         * ⑤迟到1小时以上，按照旷工计算，扣除3日工资。
         * (3)输出罚款金额
         */
        public static double late(int lateMinute,double Monthsalary){
            double fakuan = 0;    //罚款
            double Daysalary = Monthsalary / 22.5;

            if(lateMinute<11){
                System.out.println("警告！！不能迟到！！");
            }else if(lateMinute<21){
                fakuan = 100;
            }else if(lateMinute<31){
                fakuan = 200;
            }else if(lateMinute<61){
                fakuan = Daysalary/2;   //21.75指的是：月平均工作日
            }else{
                fakuan = Daysalary*3;
            }
            System.out.println("迟到时间："+lateMinute+",罚款："+fakuan);
            return fakuan;

        }
        public static void main(String[] args) {
            late(45,42000);
        }
}
