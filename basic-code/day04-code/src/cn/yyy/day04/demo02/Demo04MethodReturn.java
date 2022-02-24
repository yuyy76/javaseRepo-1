package cn.yyy.day04.demo02;

/**
 * 要求：定义一个方法，用来求出两个数字之和。
 */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是:" + num);
        System.out.println("================");
        printSum(100,200);
    }

    //方法有返回值int，谁调用就把计算结果告诉谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    //方法没有返回值，不会把结果告诉任何人，而是自己进行打印输出
    public static void printSum(int a,int b){
        int result = a+b;
        System.out.println("结果是:" + result);
    }

}
