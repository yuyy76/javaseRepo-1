package cn.yyy.day13.demo08;
/*
 生产者(包子铺)类：是一个线程类，可以继承Thread
 设置线程任务(重写run)：生产包子
 对包子的状态进行判断：
    true:
        包子铺调用wait方法进入等待状态
    false:
        包子铺生产包子
        增加一些趣味性：交替生产两种包子
            有两种状态(i%2==0)
        包子铺生产好包子
        修改包子的状态为true有
        唤醒吃货线程，让吃货线程吃包子
 注意思路：
    1、包子铺线程和包子线程关系-->通信(互斥)，不能抢夺包子的资源
    2、必须使用同步技术保证两个线程只能有一个执行
    3、锁对象必须保证唯一，可以使用包子对象作为锁对象
    4、包子铺和吃货的类就需要把对象作为参数传递进来(传递进来才能使用)
    5、怎么传递进来呢？如下：
        1）需要在成员位置创建一个包子变量
        2）使用带参数的构造方法，为这个包子变量赋值
 */
public class BaoZiPu extends Thread{
    //1、需要在成员位置创建一个包子变量
    private BaoZi bz;
    //2、使用带参数的构造方法，为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(重写run)：生产包子
    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        //循环，让包子铺一直生产包子
        while (true){
            //必须使用同步技术保证两个线程只能有一个执行
            synchronized (bz){
                //对包子的状态进行判断
                if (bz.flag==true){
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                else{                         //此处教程没有加else
                    //被唤醒之后执行,包子铺生产包子
                    //增加一些趣味性：交替生产两种包子
                    if (count % 2 == 0) {
                        //生产 薄皮三鲜馅包子
                        bz.pi = "薄皮";
                        bz.xian = "三鲜馅儿";
                    }else {
                        //生产 厚皮牛肉馅包子
                        bz.pi = "厚皮";
                        bz.xian = "牛肉馅儿";
                    }
                    count++;
                    System.out.println("包子铺正在生产： "+bz.pi+bz.xian+" 的包子");
                    //生产包子需要3秒钟
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //包子铺生产好了包子，修改包子状态为 有
                    bz.flag =true;
                    //唤醒吃货线程，让吃货线程吃包子
                    bz.notify();
                    System.out.println("包子铺已经生产好了： "+ bz.pi + bz.xian
                            + " 的包子，吃货可以开始吃了...");
//                }
            }
        }

    }
}
