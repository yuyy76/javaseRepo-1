package cn.yyy.day05.demo03;

/**
 * 遍历求数组中最大值
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 43,123,12,43,222,12,30, 20, 10000};
        //开始值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比max更大则换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值是：" + max);
    }
}
