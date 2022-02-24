package cn.yyy.day14.demo03;
/*
 练习：使用递归计算阶乘
        n的阶乘：n!=n*(n-1)*...*3*2*1
        5的阶乘：5！= 5 * 4 * 3 * 2 * 1
 */
public class Demo03Recurison {
    public static void main(String[] args) {
        int m = multi(31);
        System.out.println(m);
    }

    /**
     * 定义方法使用递归计算阶乘
     * 递归结束条件：获取到1结束
     * 递归的目的：获取下一个被乘的数字(n-1)
     * 方法的参数发生变化：5，4，3，2，1
     * @param n
     * @return
     */
    public static int multi(int n){
        if (n == 1){
            return 1;
        }
        //获取下一个被乘的数字(n-1)
        return n * multi(n-1);
    }

}
