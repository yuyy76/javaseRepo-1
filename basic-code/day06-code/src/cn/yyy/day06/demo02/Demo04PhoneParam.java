package cn.yyy.day06.demo02;

/**
 * 当一个对象作为参数，传递到方法中时，实际上传递进去的时对象的地址值
 * 数组传递到方法也是地址值
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";

        method(one);
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
