package cn.yyy.day13.demo07;
/*
 实现卖票案例
 */
public class RunnableImpl01 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //循环，让卖票操作重复执行
        while (true){
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
