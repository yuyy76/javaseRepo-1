package cn.yyy.day13.demo06;

public class Demo02SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThreadSet mt = new MyThreadSet();
        mt.setName("射雕");
        mt.start();

        ////开启多线程
        MyThreadSet mt1 = new MyThreadSet("倚天");
        mt1.start();

    }
}
