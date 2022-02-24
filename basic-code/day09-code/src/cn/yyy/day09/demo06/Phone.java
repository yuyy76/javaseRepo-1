package cn.yyy.day09.demo06;

/**
 * *  老款手机和新款手机的来电显示方法例子：
 * *  老款 来电显示 方法：显示号码
 * *  新款 来电显示 方法：显示号码、显示姓名、显示头像
 * *  设计原则：
 * *      对于已经投入使用的类，尽量不要进行修改。推荐定义一个新的类，
 * *      来重复利用其中共性内容，并且添加改动新内容。
 * *  继承就是这样一种设计原则的体现。
 */

//老款手机
public class Phone {
    public void call() {
        System.out.println("打电话");
    }

    public void send() {
        System.out.println("发短信");
    }

    public void show() {
        System.out.println("显示号码");

    }
}
