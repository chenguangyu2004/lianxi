package yichang;

import java.io.FileNotFoundException;
import java.io.FileReader;

//测试try-with-resource自动关闭AutoClosable接口的资源
public class Test05 {
    public static  void main(String[] args) {

        try(FileReader reader = new FileReader("H:/a.txt");) {
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c + c2);
        } catch (Exception e) {
            e.printStackTrace();
        }   }
}
