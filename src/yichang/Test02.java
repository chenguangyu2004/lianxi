package yichang;

import java.io.File;
import java.io.IOException;

//测试CheckException(已检查异常，编译器报错)
public class Test02 {
    public static void main(String[] args) /*throws IOException*/ {
        File file = new File("D:/a.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
