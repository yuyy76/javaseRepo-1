package cn.yyy.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：生成6个1~33之间的随机整数，添加到集合，并遍历集合
 * <p>
 * 思路：
 * 1、需要存储6个数字，创建一个集合Integer
 * 2、产生随机数，需要用到Random
 * 3、用循环6次，来产生6个随机数 nextInt 范围[33)+1
 * 4、把数字添加到集合当中，for、size、
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int ran = r.nextInt(33) + 1;
            list.add(ran);
            //System.out.println(ran);
        }
        System.out.println(list);

        for (int j = 0; j < list.size(); j++) {
            int num = list.get(j);
            System.out.println("第" + j + "次遍历：" + num);

        }
    }
}
