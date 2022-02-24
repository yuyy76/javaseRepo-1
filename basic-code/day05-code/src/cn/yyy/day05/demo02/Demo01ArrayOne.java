package cn.yyy.day05.demo02;

/**
 * 1、栈（Stack）:
 * ** main(String[] args) 进栈
 * *** int[] array
 *
 * 2、堆（Heap）
 * ** new int[3];
 *
 * 3、方法区（Method Area）：
 * ** public static void main(String[] args)
 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("================");

        //改变数组当中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
