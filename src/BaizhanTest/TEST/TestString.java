package BaizhanTest.TEST;

public class TestString {
    public static void main(String[] args) {
        String s1 = "core java";
        String s2 = "Core java";
        System.out.println(s1.charAt(3));//提取下标为3的字符
        System.out.println(s2.length());//字符串的长度
        System.out.println(s1.equals(s2));//比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串是否相等（忽略大小写）
        System.out.println(s1.indexOf("java"));//字符串中那个位置有java
        System.out.println(s1.indexOf("apple"));//字符串中是否有apple

        String s3 = "I love java.java is best language";
        System.out.println(s3.indexOf("java"));


    }
}
