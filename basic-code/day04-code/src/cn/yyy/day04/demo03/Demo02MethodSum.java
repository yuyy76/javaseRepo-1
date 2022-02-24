package cn.yyy.day04.demo03;

/**
 * 求出1到100所有数字之和
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println( "结果是："+ getSum() );
    }

    public static int getSum(){
        int sSum = 0;
        for (int i = 1; i <= 100; i++) {
//            sSum = sSum+i;
            sSum +=i;
        }
        return sSum;
    }

}
