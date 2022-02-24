package cn.yyy.day12.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.Object
类Object是类层次结构的根(父)类。
每个类都使用Object作为超(父)类。
所有对象(包括数组)都实现这个类的方法。

 */
public class Demo01ToString {
    public static void main(String[] args) {
        /**
         * Person类默认继承了Object类，所以可以使用
         * Object类中的toString方法
         * String toString()返回该对象的字符串表示。
         */
        Person p = new Person("郭靖",19);
        String s = p.toString();
        System.out.println(s);  //cn.yyy.day12.demo01.Person@2ac1fdc4

        //直接打印对象的名字，其实就是调用对象的toString p=p.toString();
        System.out.println(p);  //cn.yyy.day12.demo01.Person@2ac1fdc4

        /**
         * 看一个类是否重写了toString,直接打印这个类的对象即可，
         * 如果没有重写toString方法那么打印的是对象的地址值
         */
        Random r = new Random();
        System.out.println(r);  //java.util.Random@34ce8af7

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); //不是地址值，说明重写了toString

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);   //不是地址值，说明重写了toString


    }
}
