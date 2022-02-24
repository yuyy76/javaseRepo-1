package cn.yyy.day05.demo03;

/**
 * 遍历求数组中最大值
 */
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 15, 43, 123, 12, 43, 222, 12, 30, 20, 10000};
        //开始值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比min更小则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值是：" + min);
    }
}
