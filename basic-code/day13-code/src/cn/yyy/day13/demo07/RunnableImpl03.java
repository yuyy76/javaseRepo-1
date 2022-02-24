package cn.yyy.day13.demo07;
/*
 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票

 解决线程安全问题的第二种方案：使用同步方法
 使用步骤：
    1、把访问了共享数据的代码抽取出来，放到一个方法中
    2、在方法上添加synchronized修饰符
 格式：定义方法的格式
 修饰符 synchronized 返回值类型 方法名(参数列表){
    可能会出现线程安全问题的代码(访问了共享数据的代码)
 }
 */
public class RunnableImpl03 implements Runnable{
    //定义一个多个线程共享的票源
//    private int ticket = 100;
    private static int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        System.out.println("this:"+this);//this:cn.yyy.day13.demo07.RunnableImpl03@27f674d
        //循环，让卖票操作重复执行
        while (true){
            sellTicketStatic();
        }
    }


    /**
     * 还有一种静态的同步方法
     * 锁对象就不能是this，因为this是创建对象之后产生的，静态方法优先于对象，
     * 所以说静态方法的锁对象是本类的class属性-->class文件对象(反射)
     * 换为代码块写法等同于：
     *  synchronized(RunnableImpl03.class){...}
     */
    public static synchronized void sellTicketStatic(){
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




    /**
     * 定义一个同步方法
     *  修饰符 synchronized 返回值类型 方法名(参数列表){
     *     可能会出现线程安全问题的代码(访问了共享数据的代码)
     *  }
     *
     *  同步方法也会把方法内部的代码锁住，只让一个线程执行，
     *  同步方法的锁对象是谁? 就是实现类对象new RunnableImpl03(),
     *  也就是this
     */
/*    public synchronized void sellTicket(){
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
    }*/


}
