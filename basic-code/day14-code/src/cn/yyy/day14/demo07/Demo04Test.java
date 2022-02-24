package cn.yyy.day14.demo07;

import java.io.*;

/*
 练习：转换文件编码
    将GBK编码的文本文件，转换为UTF-8编码的文本文件。
 分析：
    1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码名称GBK
    2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码名称UTF-8
    3、使用InputStreamReader对象中的方法read读取文件
    4、使用OutputStreamWriter对象中的方法write，把读取的数据写入到文件中
    5、释放资源

 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1、创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\stream\\readgbk.txt"), "GBK");
        //2、创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码名称UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\stream\\writeutf-8.txt"), "UTF-8");
        //3、使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len=isr.read())!=-1){
//            System.out.println((char) len);
            //4、使用OutputStreamWriter对象中的方法write，把读取的数据写入到文件中
            osw.write(len);
        }
        //5、释放资源
//        osw.flush();
        osw.close();
        isr.close();
    }
}
