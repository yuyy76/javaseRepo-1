package cn.yyy.day14.demo03;

import java.io.File;

/*
 练习：递归打印多级目录
    遍历 e:\\file文件夹，及file文件夹的子文件夹
 */
public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("E:\\file");
        getAllFile(file);
    }
    /**
     * 定义一个方法，参数传递File类型的目录
     * 方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        //打印被遍历的目录名称
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否是文件夹
            if (f.isDirectory()){
                /**
                 * f是一个文件夹，则继续遍历这个文件夹
                 * 我们发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                 * 所以直接调用getAllFile方法即可：递归(自己调用自己)
                 */
                getAllFile(f);
            }else {
                //f是一个文件，直接打印即可
                System.out.println(f);
            }
        }
    }

}
