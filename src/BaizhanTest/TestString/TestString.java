package BaizhanTest.TestString;

//测试String相关类
public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        //StringBuilder str1 = new StringBuilder("abc");
        //StringBuffer str2 = new StringBuffer("abc");
        /**StringBuilder*/
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<7;i++){
            sb.append((char) ('a' + i));//追加单个字符
        }
        System.out.println(sb.toString());//转换成String输出
        sb.append(",I can sing my abc");//追加字符串
        System.out.println(sb.toString());//输出字符串
        /** StringBuffer,下面的方法同样适用于StringBuilder */
        StringBuffer sb2 = new StringBuffer("北京尚学堂");
        System.out.println(sb2);
        sb2.insert(0,"爱").insert(0,"我");//插入字符串
        System.out.println(sb2);
        sb2.delete(0,2);//删除子字符串
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);//删除某个字符
        System.out.println(sb2);
        System.out.println(sb2.charAt(0));//获取某个字符
        System.out.println(sb2.reverse());//字符串逆序

    }
}
