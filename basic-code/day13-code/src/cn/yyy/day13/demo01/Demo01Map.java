package cn.yyy.day13.demo01;

import java.util.HashMap;
import java.util.Map;

/*
  java.util.Map<k,v>集合（两个泛型）
  Map集合的特点：
    1、Map集合是一个双列集合，一个元素包含两个值(一个key,一个value)
    2、Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3、Map集合中的元素，key是不允许重复的，value是可以重复的
    4、Map集合中的元素，key和value是一一对应的

  java.util.HashMap<k,v>集合 implements Map<k,v>接口
  HashMap集合的特点：
    1、HashMap集合底层是哈希表：查询的速度特别快
        JDK1.8之前：数组+单向链表
        JDK1.8之后：数组+单向链表/红黑树(链表的长度超过8时变红黑树)：红黑树为提高查询的速度
    2、HashMap集合是一个无序的集合，意味着存储元素和取出元素的顺序有可能不一致
  java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
  LinkedHashMap集合的特点：
    1、LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序，即有序）
    2、LinkedHashMap集合是一个有序的集合，意味着存储元素和取出元素的顺序一致

 */
public class Demo01Map {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /**
     * boolean containsKey(Object key):判断集合中是否包含指定的键
     *  包含返回true;不包含返回false
     */
    private static void show04() {
        //创建Map集合对象,多态
        Map<String, Integer> map = new HashMap<>();
        map.put("宋远桥",176);
        map.put("俞莲舟",178);
        map.put("俞岱岩",173);
//        System.out.println(map);

        boolean v1 = map.containsKey("俞莲舟");//true
        boolean v2 = map.containsKey("张翠山");//false
        System.out.println(v1);
        System.out.println(v2);

    }


    /**
     * public V get(Object key):根据指定的键，在Map集合中获取对应的值。
     *  返回值：
     *      key存在，返回对应的value值
     *      key不存在，返回null
     *
     */
    private static void show03() {
        //创建Map集合对象,多态
        Map<String, Integer> map = new HashMap<>();
        map.put("宋远桥",176);
        map.put("俞莲舟",178);
        map.put("俞岱岩",173);
        System.out.println(map);
        Integer v1 = map.get("宋远桥");
        Integer v2 = map.get("张翠山");
        System.out.println(v1); //176
        System.out.println(v2); //null
    }

    /**
     * public V remove(Object key):把指定的键，所对应的键值元对元素，在Map集合中删除，返回被删除元素的值。
     *  返回值：V
     *      key存在，v返回被删除的值
     *      key不存在，v返回null
     */
    private static void show02() {
        //创建Map集合对象,多态
        Map<String, Integer> map = new HashMap<>();
        map.put("宋远桥",1);
        map.put("俞莲舟",2);
        map.put("俞岱岩",3);
        map.put("张松溪",4);
        map.put("张翠山",5);
        map.put("殷梨亭",6);
        map.put("莫声谷",7);
        System.out.println(map);

        Integer v1 = map.remove("莫声谷");
        System.out.println(v1);
        System.out.println(map);

        Integer v2 = map.remove("赵声谷");
        System.out.println(v2);
        System.out.println(map);


    }

    /**
     * public V put(K key, V value): 把指定的键与指定的值添加到Map集合中
     *  返回值：V
     *      存储键值对的时候，key不重复，返回值V是null
     *      存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("郭靖", "华筝");
        System.out.println(map);
        System.out.println(v1);
        String v2 = map.put("郭靖", "黄蓉");
        System.out.println(map);
        System.out.println(v2);

        map.put("乔峰","阿朱");
        map.put("虚竹","梦姑");
        map.put("段誉","王语嫣");
        System.out.println(map);
    }

}
