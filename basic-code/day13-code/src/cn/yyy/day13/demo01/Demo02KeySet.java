package cn.yyy.day13.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map集合的第一种遍历方式：通过键找值的方式
 Map集合中的方法：
    Set<K> keySet()：返回此映射中包含的键的 Set 视图
 实现步骤：
    1、使用Map集合中的方法keySet(),把Map集合所有的key取出来，存储到一个Set集合中
    2、遍历set集合，获取Map集合中的每一个key
    3、通过Map集合中的方法get(key)，通过key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        //创建Map集合对象,多态
        Map<String, Integer> map = new HashMap<>();
        map.put("宋远桥", 176);
        map.put("俞莲舟", 178);
        map.put("俞岱岩", 173);

        //1、使用Map集合中的方法keySet(),把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();
        System.out.println(set);
        //2、遍历set集合，获取Map集合中的每一个key
        //使用迭代器遍历set集合：
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
//            System.out.println(key);
            //3、通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("======华丽的分割线======");
        //使用增强for循环遍历set集合：
        for (String key : set) {
            //3、通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }

    }
}
