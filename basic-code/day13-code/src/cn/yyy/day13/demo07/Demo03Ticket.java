package cn.yyy.day13.demo07;
/*
 模拟卖票案例
 创建3个线程，同时开启，对共享的票进行出售
 */
public class Demo03Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl03 run = new RunnableImpl03();
        System.out.println("run："+run);//run：cn.yyy.day13.demo07.RunnableImpl03@27f674d
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法，开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
