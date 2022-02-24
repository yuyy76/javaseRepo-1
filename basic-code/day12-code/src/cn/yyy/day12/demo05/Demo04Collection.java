package cn.yyy.day12.demo05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
java.util.Collection接口
  所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
  任意的单列集合都可以使用Collection接口中的方法
  共性的方法：
     1、public boolean add(E e):把给定的对象添加到当前集合中。
     2、public void clear():清空集合中所有的元素。
     3、public boolean remove(E e):把给定的对象在当前集合中删除。
     4、public boolean contains(E e):判断当前集合中是否包含给定的对象。
     5、public isEmpty():判断当前集合是否为空。
     6、public int size():返回集合中元素的个数。
     7、public Object[] to Array():把集合中的元素，存储到数组中。
 */
public class Demo04Collection {
    public static void main(String[] args) {
        //创建集合对象,可以使用多态
        Collection<String> coll = new ArrayList<>();
//        Collection<String> coll = new HashSet<>();
        System.out.println(coll);//[]打印的不是地址，说明重写了toString方法

        /**
         * 1、把给定的对象添加到当前集合中，返回值是一个boolean，
         * 一般都返回true,所以可以不用接收
         */
        boolean b1 = coll.add("王重阳");
        System.out.println("b1:" + b1);
        coll.add("欧阳锋");
        coll.add("黄药师");
        coll.add("洪七公");
        coll.add("一灯大师");
        coll.add("一灯大师");
        coll.add("一灯大师");
        coll.add("一灯大师");
        coll.add("一灯大师");
        System.out.println(coll);

        /**
         * 3、public boolean remove(E e):把给定的对象在当前集合中删除
         * 返回值是一个布尔值，集合中存在元素，删除元素，返回true
         *                 集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("欧阳锋");
        System.out.println(coll);
        System.out.println("b2:" + b2);
        boolean b3 = coll.remove("黄蓉");
        System.out.println("b3:" + b3);
        System.out.println(coll);

        /**
         * public boolean contains(E e):判断当前集合中是否包含给定的对象
         * 包含返回true，不包含返回false
         */
        boolean b4 = coll.contains("周伯通");
        System.out.println("b4:" + b4);
        boolean b5 = coll.contains("黄药师");
        System.out.println("b5:" + b5);

        /**
         * 5、public isEmpty():判断当前集合是否为空
         * 集合为空返回true，不为空返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);

        /**
         * 6、public int size():返回集合中元素的个数
         */
        int b7 = coll.size();
        System.out.println("b7:"+b7);

        /**
         * 7、public Object[] to Array():把集合中的元素，存储到数组中
         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /**
         * 2、public void clear():清空集合中所有的元素
         * 但是不删除集合，集合还存在
         */
        coll.clear();
        System.out.println(coll.size());
        System.out.println(coll.isEmpty());



    }
}
