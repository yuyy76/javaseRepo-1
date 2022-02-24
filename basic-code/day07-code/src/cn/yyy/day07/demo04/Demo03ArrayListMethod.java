package cn.yyy.day07.demo04;

import java.util.ArrayList;

/**
 * ArrayList当中的常用方法有
 * public boolean add(E e):向集合当中添加元素，参数类型和泛型一致，返回值代表是否添加成功
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
 * 但是对于其他集合（今后学习）来说，add添加动作不一定成功
 *
 * public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
 *
 *
 * public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
 *
 *
 * public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
 *
 *
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素：add
        boolean success = list.add("王重阳");
        System.out.println(list);
        System.out.println("添加是否成功："+success);

        list.add("黄药师");
        list.add("欧阳锋");
        list.add("一灯大师");
        list.add("洪七公");
        System.out.println(list);

        //从集合中获取元素：get。索引值从0开始
        String name = list.get(3);
        System.out.println(name);

        //从集合中删除元素：remove，索引值从0开始。
        String whoRemove = list.remove(2);
        System.out.println("被删除的是："+whoRemove);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合的长度是："+size);




    }
}
