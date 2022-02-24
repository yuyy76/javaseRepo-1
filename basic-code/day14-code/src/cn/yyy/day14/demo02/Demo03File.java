package cn.yyy.day14.demo02;

import java.io.File;

/*
 File类获取功能的方法
    public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串。
    public String getPath()：将此抽象路径名转换为一个路径名字符串。
    public String getName()：返回由此抽象路径名表示的文件或目录的名称。
    public long length()：返回由此抽象路径名表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /**
     * public long length()：返回由此抽象路径名表示的文件的长度
     * 获取的是构造方法指定的文件的大小，以字节为单位
     * 注意：
     *    文件夹是没有大小概念的，不能获取文件夹的大小
     *    如果构造方法中给出的路径不存在，那么Length方法返回0
     */
    private static void show04() {
        File f1 = new File("public long length()：返回由此抽象路径名表示的文件的长度");
        File f2 = new File("C:\\Users\\Administrator\\Desktop\\tmp");
        File f3 = new File("C:\\Users\\Administrator\\Desktop\\tmp\\a.txt");
        File f4 = new File("D:\\2020-12-03\\Beyond - 不再犹豫.mp3");
        long length1 = f1.length();
        System.out.println(length1);
        long length2 = f2.length();
        System.out.println(length2);
        long length3 = f3.length();
        System.out.println(length3);
        long length4 = f4.length();
        System.out.println(length4);
    }

    /**
     * public String getName()：返回由此抽象路径名表示的文件或目录的名称
     * 获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void show03() {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\a.txt");
        File f2 = new File("D:\\IdeaProjects\\basic-code");
        String name1 = f1.getName();
        System.out.println(name1);
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /**
     * public String getPath()：将此抽象路径名转换为一个路径名字符串。
     * 获取构造方法中传递的路径
     *
     * toString()方法调用的就是getPath()
     */
    private static void show02() {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\a.txt");
        File f2 = new File("b.txt");
        String path1 = f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);

        System.out.println(f1);
        System.out.println(f1.toString());

    }

    /**
     * public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串。
     * 获取的构造方法中传递的路径
     * 无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("D:\\IdeaProjects\\basic-code\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\IdeaProjects\basic-code\a.txt

        File f2 = new File("b.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);

    }
}
