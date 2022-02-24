package cn.yyy.day07.demo03;

import java.util.Random;

/**
 * Random类用来生成随机数字，使用起来也是三个步骤：
 * 1、导包：import
 * 2、创建：Random r = new Random();
 * 3、使用：
 *  获取一个随机的数字，范围是int所有范围，有正负两种，r.nextInt()
 *  获取一个随机的数字，参数代表范围，左闭右开区间，r.nextInt(3)
 *  实际上代表的含义是：[0,3)，也就是0~2间的随机数
 *
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
