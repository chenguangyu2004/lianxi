package yichang;

//测试throws异常处理语句

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("H:/a.txt");
        try {
            reader = new FileReader("H:/a.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c + c2);
        }  finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
