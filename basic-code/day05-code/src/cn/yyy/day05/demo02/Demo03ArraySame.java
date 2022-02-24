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
public class Demo03ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("================");

        //改变数组当中元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("===========================");

        //将arrayA数组的地址值，赋值给arrayB数组
        int[] arrayB = arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("================");

        //改变数组当中元素的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("=========阿斯顿======");

        //再次打印arrayA数组的地址值
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);



    }
}
