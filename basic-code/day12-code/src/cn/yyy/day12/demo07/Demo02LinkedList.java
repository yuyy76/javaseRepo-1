package cn.yyy.day12.demo07;

import java.util.LinkedList;

/*
 java.util.LinkedList集合 implements List接口
 LinkedList集合的特点：
    1、底层是一个链表结构：查询慢，增删快
    2、里边包含了大量操作首尾元素的方法
    注意：使用LinkedList集合特有的方法，不能使用多态（多态的弊端是看不到子类特有的方法）

    public void addFirst(E e)：将指定元素插入此列表的开头。
    public void addLast(E e)：将指定元素添加到此列表的结尾。
    public void push(E e)：将元素推入此列表所表示的堆栈。

    public E getFirst()：返回此列表的第一个元素。
    public E getLast()：返回此列表的最后一个元素。

    public E removeFirst()：移除并返回此列表的第一个元素。
    public E removeLast()：移除并返回此列表的最后一个元素。
    public E pop()：从此列表所表示的堆栈处弹出一个元素。

    public boolean isEmpty()如果此列表不包含元素，则返回true。



 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    /**
     * public E removeFirst()：移除并返回此列表的第一个元素。
     * public E removeLast()：移除并返回此列表的最后一个元素。
     * public E pop()：从此列表所表示的堆栈处弹出一个元素。相当于removeFirst()
     */
    private static void show03() {
        //使用LinkedList集合特有的方法，不能使用多态
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("乔峰");
        linked.add("虚竹");
        linked.add("段誉");
        System.out.println(linked);

        String f = linked.removeFirst();
        System.out.println("移除的第一个：" + f);
        String l = linked.removeLast();
        System.out.println("移除的第二个：" + l);
        System.out.println(linked);
//        String p = linked.pop();

    }

    /**
     * public E getFirst()：返回此列表的第一个元素。
     * public E getLast()：返回此列表的最后一个元素。
     */
    private static void show02() {
        //使用LinkedList集合特有的方法，不能使用多态
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("乔峰");
        linked.add("虚竹");
        linked.add("段誉");
//        System.out.println(linked);

//        linked.clear();//清空集合中的元素,集合中没有元素时，抛出NoSuchElementException

        //public boolean isEmpty()如果此列表不包含元素，则返回true。
        if (!linked.isEmpty()) {

            //public E getFirst()：返回此列表的第一个元素。
            String first = linked.getFirst();
            System.out.println(first);
            //public E getLast()：返回此列表的最后一个元素。
            System.out.println(linked.getLast());
        }
    }

    /**
     * public void addFirst(E e)：将指定元素插入此列表的开头。
     * public void addLast(E e)：将指定元素添加到此列表的结尾。
     * public void push(E e)：将元素推入此列表所表示的堆栈。
     */
    private static void show01() {
        //使用LinkedList集合特有的方法，不能使用多态
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("乔峰");
        linked.add("虚竹");
        linked.add("段誉");
        System.out.println(linked);

        //public void addFirst(E e)：将指定元素插入此列表的开头。
        linked.addFirst("阿朱");
        //public void push(E e)：将元素推入此列表所表示的堆栈。 等效于addFirst()
        linked.push("阿紫");
        //public void addLast(E e)：将指定元素添加到此列表的结尾。 等效于add()
        linked.addLast("王语嫣");
        System.out.println(linked);

    }
}
