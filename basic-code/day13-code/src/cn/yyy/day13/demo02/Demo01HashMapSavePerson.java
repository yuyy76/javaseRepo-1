package cn.yyy.day13.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 HashMap存储自定义类型键值
 Map集合保证key是唯一的：
    作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一

 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /**
     * HashMap存储自定义类型键值
     * key：Person类型         （同名同年龄的人视为同一人：需重写hashCode方法和equals方法）
     *      作为key的元素，Person类必须重写hashCode方法和equals方法，以保证key唯一
     * value：String类型
     *      可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("周芷若",20),"武当");
        map.put(new Person("小昭",18),"明教");
        map.put(new Person("赵敏",19),"蒙古");
        map.put(new Person("周芷若",20),"峨眉");
        //使用EntrySet和增强for循环遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            //Person未重写hashCode和equals时，Person{name='周芷若', age=20}--->武当、峨眉都有
            System.out.println(key + "--->" + value);

        }


    }

    /**
     * HashMap存储自定义类型键值
     * key：String类型
     *      String类重写了hashCode方法和equals方法，可以保证key唯一
     * value：Person类型
     *      value可以重复（同名同年龄的人视为同一人）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("明教", new Person("杨逍", 30));
        map.put("武当", new Person("俞莲舟", 40));
        map.put("峨眉", new Person("灭绝师太", 50));
        map.put("明教", new Person("范遥", 30));
        //使用keySet加增强for循环遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
