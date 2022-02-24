package cn.yyy.day14.demo02;

import java.io.File;

/*
 File类遍历(文件夹)目录功能
    public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录
    Public File[] listFiles()：返回一个File(抽象路径名)数组，表示该File目录中的所有的子文件或目录
 注意：
    List方法和ListFile方法遍历的是构造方法中给出的目录
    如果构造方法中给出的目录的路径不存在，会抛出空指针异常
    如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /**
     * Public File[] listFiles()：返回一个File(抽象路径名)数组，表示该File目录中的所有的子文件或目录
     * 遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹的名称,把文件/文件夹封装为File对象，多个File对象
     * 存储到File数组中
     */
    private static void show02() {
        File f1 = new File("D:\\IdeaProjects\\basic-code");
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /**
     * public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录
     * 遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
//        File f1 = new File("D:\\IdeaProjects\\basic-code");
//        File f1 = new File("C:\\Users\\Administrator\\Desktop\\tmp\\File\\file01\\file.txt");//NullPointerException
//        File f1 = new File("C:\\Users\\Administrator\\Desktop\\tmp\\Fi");//NullPointerException
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\tmp\\File");
        String[] list1 = f1.list();
        for (String s1 : list1) {
            System.out.println(s1);
        }
    }
}
