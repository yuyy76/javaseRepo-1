package cn.yyy.day05.demo03;

/**
 * 遍历数组，说的就是对数组当中的每一个元素进行逐一、挨个儿处理。
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {12,23,34,45,56,67,78,89};
        //array.fori 快捷
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
