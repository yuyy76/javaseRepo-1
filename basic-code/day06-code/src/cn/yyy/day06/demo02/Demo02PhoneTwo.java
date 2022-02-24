package cn.yyy.day06.demo02;

public class Demo02PhoneTwo {
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

        System.out.println("******************");

        //根据phone类再创建一个名为two的对象
        Phone two = new Phone();

        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        System.out.println("==========");
        two.brand = "小米";
        two.color = "金色";
        two.price = 3388.36;

        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==========");

        two.call("阳顶天");
        two.sendMessage();

    }
}
