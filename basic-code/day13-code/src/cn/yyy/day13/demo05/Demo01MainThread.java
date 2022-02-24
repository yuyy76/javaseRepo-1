package cn.yyy.day13.demo05;
/*
 并发：指两个或多个事件在同一时间段内发生，交替执行；一个人吃两个馒头，吃一口A，再吃一口B...
 并行：指两个或多个事件在同一时刻发生(同时发生)，同时执行；两个人吃两个馒头...

 主线程：执行主(main)方法的线程
 单线程程序：java程序中只有一个线程
 执行从main方法开始，从上到下依次执行

 JVM执行main方法，main方法会进入到栈内存；JVM会找操作系统开辟一条main方法通向cpu的执行路径，
 cpu就可以通过这个路径来执行main方法，而这个路径有一个名字，叫main(主)线程



 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("黄蓉");
        p1.run();

        System.out.println(0/0);//Exception in thread "main" java.lang.ArithmeticException:

        Person p2 = new Person("赵敏");
        p2.run();
    }
}
