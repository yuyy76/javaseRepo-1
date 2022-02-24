package cn.yyy.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 要求：根据int变量n的值来获取随机数字，范围是[1,n]，可以取到1和n。
 * <p>
 * 1、随机数
 * 2、n为输入，Scanner
 * 3、左闭右开区间，n+1即可
 */
public class Demo03Random {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        int n = sc.nextInt();

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n)+1;
            System.out.println(num);
        }

    }
}
