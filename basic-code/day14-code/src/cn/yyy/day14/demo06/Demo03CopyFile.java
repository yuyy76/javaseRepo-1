package cn.yyy.day14.demo06;

import java.io.*;

/*
 文件复制练习：一读一写

 明确：
    数据源：D:\stream\32.jpg
    数据目的地：E:\file\stream\32.jpg
 文件复制的步骤：
    1、创建字节缓冲输入流对象，构造方法中传递字节输入流
    2、创建字节缓冲输出流对象，构造方法中传递字节输出流
    3、使用字节缓冲输入流对象中的方法read，读取文件
    4、使用字节缓冲输出流中的方法write,把读取到的数据写入到内部缓冲区中
    5、释放资源(会先把缓冲区中的数据，刷新到文件中)

 一次一个字节：23729 ms
 数组缓冲读取多个字节：65 ms

 缓冲流 一次一个字节：150 ms
 缓冲流 数组缓冲读取多个字节：15 ms

 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1、创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\stream\\32.jpg"));
        //2、创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\file\\stream\\32.jpg"));
        //3、使用字节缓冲输入流对象中的方法read，读取文件
        //一次读取一个字节 写入一个字节的方式
/*        int len = 0;
        while ((len=bis.read())!=-1){
            //4、使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            bos.write(len);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        //3、使用字节输入流对象中的方法read读取文件
        int len = 0; //每次读取的有效字节个数
        while ((len=bis.read(bytes))!=-1){
            //4、使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            bos.write(bytes,0,len);
        }

        //5、释放资源(注意：先关写的，后关读的；如果写完了，肯定读取完毕了)
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("total need: "+ (e-s) + " ms");
    }
}
