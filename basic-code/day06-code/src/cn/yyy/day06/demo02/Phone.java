package cn.yyy.day06.demo02;

/**
 * 定义一个类，用来模拟手机
 * 属性：品牌、价格、颜色
 * 行为：打电话、发短信、
 * 对应到类当中
 * 成员变量（属性）：String brand、double price、String color
 * 成员方法（行为）：call(String who){};  sendMessage(){};
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");

    }

    public void sendMessage() {
        System.out.println("群发短信");
    }

}
