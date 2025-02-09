package changyonglei;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "204-10-1 10:10:10";
        Date guoqing100 = format.parse(str);
        System.out.println(guoqing100.getTime());
        System.out.println(guoqing100);

        //将时间转换成字符串
        DateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日  hh时mm分ss秒");
        Date date2 = new Date(251555154215455L);
        String date2str = format2.format(date2);
        System.out.println(date2str);

        //小妙招
        Date now = new Date();
        DateFormat f1 = new SimpleDateFormat("今年的第D天，第w周");
        String str3 = f1.format(now);
        System.out.println(str3);
    }
}
