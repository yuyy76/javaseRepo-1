package cn.yyy.day04.demo03;

/**
 * 定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        helloPrint(5);
    }

    /**
     * 三要素：返回值类型、方法名称、参数列表
     */
    public static void helloPrint(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("第" + i + "次 Hello World");
        }
    }
}
