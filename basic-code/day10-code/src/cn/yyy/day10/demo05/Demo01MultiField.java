package cn.yyy.day10.demo05;
/*
多态中成员变量的使用特点：
访问成员变量的两种方式：
1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2、间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);    //父 10
//        System.out.println(obj.age);    //错误写法，父中没有成员变量age
        System.out.println("==========");

        //子类如果没有覆盖重写，就是父 10
        //子类如果覆盖重写，就是子 20
        obj.showNum();
    }
}
