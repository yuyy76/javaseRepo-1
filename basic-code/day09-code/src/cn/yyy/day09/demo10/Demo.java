package cn.yyy.day09.demo10;


public class Demo {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.show();
        zi.method();
    }
}




/**
 * 一、Java语言是单继承的。
 * 一个类的直接父类只能有唯一一个：
 * class A{}
 * class B extends A {} //正确
 *
 * class C{}
 * class D extends A，C{}    //错误
 *
 * 二、Java语言可以多级继承
 * 我有一个父亲，我父亲还有一个父亲，也就是爷爷。
 * class A{}
 * class B extends A{}  //正确
 * class C extends B{}  //正确
 * 其中A也是C的父类
 * java.lang.Object是最高级的。
 *
 * 三、一个子类的直接父类是唯一的，但是一个父类可以拥有很多个子类
 * 可以有很多个兄弟姐妹，生二胎。
 * class A{}
 * class B extends A{}  //正确
 * class C extends A{}  //正确
 *
 *
 *
 *
 */