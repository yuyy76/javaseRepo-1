package cn.yyy.day13.demo07;
/*
 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票

 解决线程安全问题的一种方案：使用同步代码块
 格式：
    synchronized(锁对象){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
 注意：
    1、同步代码块中的锁对象，可以是任意的对象
    2、但是必须保证多个线程使用的锁对象是同一个
    3、锁对象的作用：把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl02 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //创建一个锁对象   任意对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        //循环，让卖票操作重复执行
        while (true){
            //同步代码块
            synchronized (obj){
                //先判断票是否存在
                if (ticket>0){
                    //为提高问题出现的概率，让程序睡眠一下
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+
                            "-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }

        }

    }
}
