package cn.yyy.day14.demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 文件复制练习：一读一写

 明确：
    数据源：D:\stream\file\39.jpg
    数据目的地：E:\file\stream\39.jpg
 文件复制的步骤：
    1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
    2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
    3、使用字节输入流对象中的方法read读取文件
    4、使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
    5、释放资源

 */
public class Demo06CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\stream\\file\\39.jpg");
        //2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\file\\stream\\39.jpg");
        //3、使用字节输入流对象中的方法read读取文件
        //一次读取一个字节 写入一个字节的方式
        int len = 0;
        while ((len=fis.read())!=-1){
            //4、使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(len);
        }

/*        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        //3、使用字节输入流对象中的方法read读取文件
        int len = 0; //每次读取的有效字节个数
        while ((len=fis.read(bytes))!=-1){
            //4、使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,len);
        }*/

        //5、释放资源(注意：先关写的，后关读的；如果写完了，肯定读取完毕了)
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时："+ (e-s) + "毫秒");
    }
}
