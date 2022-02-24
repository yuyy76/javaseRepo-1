package cn.yyy.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 思路:
 * 1、首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
 * 2、需要键盘输入，用到Scanner
 * 3、获取键盘输入的数字，用到Scanner的nextInt方法
 * 4、已经得到两个数字，判断if一下三种情况
 *   如果大了，提示太大，并且重试
 *   如果太小，提示小了，并且重试
 *   如果猜中，游戏结束
 * 5、重试就是再来一次，循环次数不确定，用while(true)
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1; //[1,100)
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜测的数字1-100之间:" );
            int guessNum = sc.nextInt();

            if (guessNum > randomNum){
                System.out.println("太大了，请重试。");
            }else if (guessNum < randomNum){
                System.out.println("太小了，请重试。");
            }else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
