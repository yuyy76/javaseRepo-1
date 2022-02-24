package cn.yyy.day07.demo01;

import java.util.Scanner;

/**
 * 要求键盘输入两个数字，并且求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();
        int sum = num1 + num2;

        System.out.println("两个数字之和是：" + sum);
    }
}
