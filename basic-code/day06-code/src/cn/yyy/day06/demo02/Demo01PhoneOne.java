package cn.yyy.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据phone类创建一个名为one的对象
        Phone one = new Phone();

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        System.out.println("==========");
        one.brand = "华为";
        one.color = "黑色";
        one.price = 6388.36;

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");

        one.call("张无忌");
        one.sendMessage();



    }
}
