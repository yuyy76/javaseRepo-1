package cn.yyy.day13.demo06;
/*
 static void sleep(long millis):在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
 毫秒数结束之后，程序继续执行
 */
public class Demo03Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
