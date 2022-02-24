package cn.yyy.day12.demo07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 java.util.List接口 extends Collection接口
 List接口的特点：
    1、有序的集合,存储元素和取出元素的顺序是一致的。（存储123，取出123）
    2、有索引,包含了一些带索引的方法
    3、允许存储重复的元素

 List接口中带索引的方法（特有）
    增：public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
    查：public E get(int index)：返回集合中指定位置的元素。
    删：public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
    改：public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值是更新前的元素。
 注意：
    操作索引的时候，一定要防止索引越界的异常
        IndexOutOfBoundsException：索引越界异常,集合会报
        ArrayIndexOutOfBoundsException：数组索引越界异常
        StringIndexOutOfBoundsException：字符串索引越界异常

 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");//允许重复
        //打印集合
        System.out.println(list);   //不是地址，说明重写了toString方法

        //增：public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个itYyy
        list.add(3, "itYyy");
        System.out.println(list);

        //删：public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        //移除c元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素是：" + removeE);
        System.out.println(list);

        //改：public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值是更新前的元素。
        //把最后一个a替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是：" + setE);
        System.out.println(list);


        /**
         * List集合遍历有3种方式：
         * 1、使用普通的for循环
         */
        for (int i = 0; i < list.size(); i++) {
            //查：public E get(int index)：返回集合中指定位置的元素
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("==============");
        /**
         * 2、使用迭代器来遍历
         */
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==============");
        /**
         * 3、迭代器的简化版本，增强for循环（for each）
         */
        for (String s : list) {
            System.out.println(s);
        }

        //注意：越界异常
        String r = list.get(5); //IndexOutOfBoundsException：集合长度才是5，索引越界
        System.out.println(r);

    }
}
