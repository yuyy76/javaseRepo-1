package cn.yyy.day14.demo02;
/*
 路径：
    绝对路径：是一个完整的路径
        以盘符(c:,D:)开始的路径
            c:\\a.txt
            D:\\IdeaProjects\\basic-code\\day14-code\\123.txt
    相对路径：是一个简化的路径
        相对指的是相对于当前项目的根目录(D:\\IdeaProjects\\basic-code\\day14-code)
        如果使用当前项目的根目录，路径可以简化书写
        D:\\IdeaProjects\\basic-code\\day14-code\\123.txt-->简化为：123.txt(省略根目录)
    注意事项：
        1、路径是不区分大小写
        2、路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */

import java.io.File;

/**
 * 学习一个类，首先看这个类中是否有静态成员，静态成员我们可以直接通过类名访问；
 *  第二个就要学这个类的构造方法，通过构造方法可以创建对象，创建完对象后可以通过对象名访问成员方法
 *
 */
public class Demo02File {
    public static void main(String[] args) {
        /**
         * File类的构造方法
         */
        show01();
//        show02("E:\\","c.txt");
//        show03();
    }

    /**
     * 第三个构造方法
     * File(File parent, String child)
     *           根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
     * 参数：把路径分成了两部分
     *    File parent：父路径
     *    String child：子路径
     * 好处：
     *    父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
     *    父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径操作对象
     */
    private static void show03() {
        File parent = new File("d:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);
    }

    /**
     * 第二个构造方法
     * File(String parent, String child)
     *           根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
     * 参数：把路径分成了两部分
     *    String parent：父路径
     *    String child：子路径
     * 好处：
     *    父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File f1 = new File(parent,child);
        System.out.println(f1);
    }


    /**
     * 第一个构造方法
     * File(String pathname)
     *           通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
     * 参数：
     *    String pathname：字符串的路径名称
     *    路径可以是文件结尾，也可以是以文件夹结尾
     *    路径可以是相对路径，也可以是绝对路径
     *    路径可以是存在，也可以是不存在
     *    创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\day14-code\\a.txt");
        System.out.println(f1);

        File f2 = new File("D:\\IdeaProjects\\basic-code\\day14-code");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}
