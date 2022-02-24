package cn.yyy.day13.demo02;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。 有序的集合
 底层原理：
    哈希表+链表(记录元素的顺序)

 */
public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);    //key不允许重复，无序的集合

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("d","d");
        linked.put("b","b");
        System.out.println(linked); //key不允许重复，有序的集合




    }
}
