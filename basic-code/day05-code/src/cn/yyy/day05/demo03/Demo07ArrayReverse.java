package cn.yyy.day05.demo03;

/**
 * 数组元素的反转：
 * 本来的样子：[1,2,3,4] 反转之后[4,3,2,1]
 * 要求不能使用新数组，就用原来的数组
 * <p>
 * 1、数组元组反转就是对称位置的元素交换
 * 2、通常遍历数组用的是一个索引，现在表示对称位置需要两个索引
 * ** min = 0;max=array.length - 1
 * 3、用第三个变量倒手进行两个变量值的交换
 * 4、什么时候应该交换？min<max时
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 15, 6, 100, 89, 25};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("======================");

        /**
         * 初始化语句：int min = 0,max= array.length -1
         * 条件判断：min < max
         * 步进表达式：min++,max--
         * 循环体：用第三个变量倒手
         */
        for (int min = 0, max = array.length - 1; min < max; min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次打印遍历输出反转后的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
