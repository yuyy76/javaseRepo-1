package cn.yyy.day07.demo01;

import java.util.Scanner;

/**
 * 题目：键盘输入三个int数字，然后求出其中的最大值
 *
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();

        if (num1 >= num2){
            if (num1>=num3){
                System.out.println(num1);
            }else{
                System.out.println(num3);
            }

        }else if (num1<=num2){
            if (num2>=num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }
    }
}
