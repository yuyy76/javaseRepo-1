package cn.yyy.day13.demo03;
/*
 Debug调试程序：
    可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
 使用方式：
    在行号的右边，鼠标左键单击，添加断点(初学：每个方法的第一行；后期：哪里有bug加到哪里)
    右键选择Debug执行程序
    程序就会停留在添加的第一个断点处
 执行程序：
    F8(Step Over):逐行执行程序
    F7(Step Into)：进入到方法中
    Shift+F8(Step Out)：跳出方法
    F9(Resume Program):跳到下一个断点，如果没有下一个断点，那么就结束程序
    Ctrl+F2(Stop)：退出debug模式，停止程序
    Console：切换到控制台
 */
public class Demo01Debug {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);*/

/*        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }*/

        print();

    }

    private static void print() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");

    }
}
