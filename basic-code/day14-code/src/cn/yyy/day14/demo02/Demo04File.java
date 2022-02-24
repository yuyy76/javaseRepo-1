package cn.yyy.day14.demo02;

import java.io.File;

/*
 File判断功能的方法
    public boolean exists()：此File表示的文件或目录是否实际存在。
    public boolean isDirectory()：此File表示的文件是否是一个目录。
    public boolean isFile()：此File表示的文件是否是一个标准文件。
 */
public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /**
     * public boolean isDirectory()：此File表示的文件是否是一个目录
     *  用于判断构造方法中给定的路径是否以文件夹结尾
     *      是：true
     *      否：false
     * public boolean isFile()：此File表示的文件是否是一个标准文件
     *  用于判断构造方法中给定的路径是否以文件夹结尾
     *      是：true
     *      否：false
     * 注意：
     *      电脑的硬盘中只有文件/文件夹，两个方法是互斥
     *      这两个方法的使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        //存在的文件/文件夹
        File f1 = new File("aa.txt");
        System.out.println("是文件夹吗："+f1.isDirectory()+"；是文件吗："+f1.isFile());
        File f2 = new File("C:\\Users\\Administrator\\Desktop\\tmp");
        System.out.println("是文件夹吗："+f2.isDirectory()+"；是文件吗："+f2.isFile());

        //不存在的文件/文件夹
        File f3 = new File("aaa.txt");
        System.out.println("是文件夹吗："+f3.isDirectory()+"；是文件吗："+f3.isFile());
        File f4 = new File("C:\\Desktop\\tmp");
        System.out.println("是文件夹吗："+f4.isDirectory()+"；是文件吗："+f4.isFile());

        //可以先判断下，不存在就没必要获取
        File f5 = new File("C:\\Users\\Administrator\\Desktop\\tmp\\a.txt");
        if (f5.exists()){
            System.out.println(f5.isDirectory());
            System.out.println(f5.isFile());
        }



    }

    /**
     * public boolean exists()：此File表示的文件或目录是否实际存在
     * 用于判断构造方法中的路径是否存在
     *      存在：true
     *      不存在：false
     */
    private static void show01() {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\tmp");
        boolean es1 = f1.exists();
        System.out.println(es1);

        File f2 = new File("d:\\Users\\Desktop\\tmp999");
        boolean es2 = f2.exists();
        System.out.println(es2);

        File f3 = new File("aa.txt");
        boolean es3 = f3.exists();
        System.out.println(es3);

    }
}
