package changyonglei;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));//获得当前文件的路径
        File f2 = new File("a.txt");
        f2.createNewFile();//创建文件
    }
}
