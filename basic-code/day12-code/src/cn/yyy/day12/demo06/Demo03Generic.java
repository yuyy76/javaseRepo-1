package cn.yyy.day12.demo06;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo03Generic {
    public static void main(String[] args) {
//        show01();   //不使用泛型会引发的问题
        show02();

    }

    /**
     * 创建集合对象，使用泛型
     * 好处：
     * 1、避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
     * 2、把运行期（代码运行后抛出的）异常，提升到了编译期（写代码时候报错）
     * 弊端：
     * 1、泛型是什么类型，只能存储什么类型的数据。
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("杨过");
        list.add("小龙女");
//        list.add(3.14); //类型不匹配报错
        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + "长度：" + s.length());
        }

    }

    /**
     * 创建集合对象，不使用泛型
     * 好处：
     * 1、集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
     * 弊端：
     * 1、不安全、会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();  //不写泛型就是默认Object
        list.add("张三丰");
        list.add(6);    //Integer
        list.add(true); //boolean
        list.add(3.14); //double

        //使用迭代器遍历list集合
        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            //以上暂时没有问题，注意下面需求
            /**
             * 想要使用String类特有的方法,length获取字符串的长度；
             *  不能使用，因为是多态 Object obj = "abc"，需要
             *  向下转型
             *  会抛出类型转换异常，ClassCastException不能把Integer、
             *  boolean、double等转换为String
             */
            String s = (String) obj;//ClassCastException
            System.out.println(s.length());
        }


    }
}
