package cn.yyy.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println("第"+i+"个小于10的非负随机数：" + num);
        }
    }
}
