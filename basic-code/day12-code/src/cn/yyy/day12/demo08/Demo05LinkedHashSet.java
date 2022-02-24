package cn.yyy.day12.demo08;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 java.util.LinkedHashSet集合 extends HashSet集合
 LinkedHashSet集合特点：
    底层是一个哈希表(数组+链表/红黑树)+链表：多了一条链表(记录
    元素的存储顺序)，保证元素有序。

 */
public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("yyy");
        set.add("abc");
        set.add("www");
        set.add("abc");
        System.out.println(set);//[abc, www, yyy]无序的，且不允许重复

        System.out.println("==============");
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("yyy");
        linked.add("abc");
        linked.add("www");
        linked.add("abc");
        System.out.println(linked);//[yyy, abc, www]有序的(存取顺序一致),不允许重复


    }
}
