package JueJin;

/*
小M在工作时遇到了一个问题，他需要将用户输入的不带千分位逗号的数字字符串转换为带千分位逗号的格式，并且保留小数部分。小M还发现，
有时候输入的数字字符串前面会有无用的 0，这些也需要精简掉。请你帮助小M编写程序，完成这个任务。
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class disanti {
    public static String solution(String s) {
        // 去除前导零
        s = s.replaceFirst("^0+(?!$)", "");   //把整数部分的0全部

        // 分割整数部分和小数部分
        String[] parts = s.split("\\."); /*这里的分隔符是 "\\."。在 Java 中，. 是一个特殊字符，代表任意字符，所以要将其作为
        普通的 . 字符来使用，需要使用转义字符 \ 对其进行转义。然而，在 Java 的字符串中，\ 本身也需要转义，所以最终写成了 "\\."。*/
        String integerPart = parts[0];  //整个整数部分是parts[0];
        String decimalPart = parts.length > 1 ? "." + parts[1] : "";

        // 格式化整数部分
        DecimalFormat formatter = new DecimalFormat("#,###", new DecimalFormatSymbols(Locale.US));
        String formattedIntegerPart = formatter.format(Long.parseLong(integerPart));

        // 合并整数部分和小数部分
        return formattedIntegerPart + decimalPart;
    }

    public static void main(String[] args) {
        System.out.println(solution("1294512.12412").equals("1,294,512.12412")); // true
        System.out.println(solution("0000123456789.99").equals("123,456,789.99")); // true
        System.out.println(solution("987654321").equals("987,654,321")); // true
    }
}