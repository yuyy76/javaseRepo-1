package cn.yyy.day14.demo04;

import java.io.FileInputStream;
import java.io.IOException;

/*
 使用字节流读取中文文件
 1个中文
    GBK：占用2个字节
    UTF-8：占用3个字节

 */
public class Demo07InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\stream\\data\\c.txt");
        int len = 0;
        while ((len=fis.read())!= -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
