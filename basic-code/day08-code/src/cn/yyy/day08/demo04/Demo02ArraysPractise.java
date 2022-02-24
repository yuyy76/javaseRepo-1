package cn.yyy.day08.demo04;

import java.util.Arrays;

/**
 * 题目：用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并降序打印
 *
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "wzq3eru8ioj56s9dgf4ka7h";

        //如何进行升序排列：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);

        //需要倒序遍历    快捷输入：chars.forr倒序 ，fori是正序
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
