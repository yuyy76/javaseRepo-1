package cn.yyy.day04.demo03;

/**
 * 定义一个方法，用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        boolean result = isSame(1023, 1024);
        System.out.println(result);
    }

    public static boolean isSame(int a, int b) {
        /*boolean same;
        if (a == b){
            same = true;
        }else {
            same = false;
        }*/

//        boolean same = a==b? true:false;

        boolean same = a == b;  //判断a和b是否相等，结果赋值给same
        return same;
    }

}
