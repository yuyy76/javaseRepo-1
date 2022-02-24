package cn.yyy.day13.demo02;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性：
        List接口，Set接口，Map接口：里边增加了一个静态的方法of，可以给集合一次性添加多个元素
        static <E> List<E> of (E...elements)
        使用前提：
            当集合中存储的元素的个数已经确定了，不再改变时使用。
        注意：
            1、of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
            2、of方法的返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，会抛出异常
            3、Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 */
public class Demo05JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
//        list.add("w");//UnsupportedOperationException 不支持操作异常

//        Set<String> set = Set.of("a", "b", "a", "c", "d");//IllegalArgumentException 非法参数异常，有重复元素a
        Set<String> set = Set.of("a", "b", "e", "c", "d");
        System.out.println(set);
//        set.add("f");//UnsupportedOperationException 不支持操作异常

        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20, "赵六", 18);//不能重复
        System.out.println(map);
        map.put("周七",21);//UnsupportedOperationException


    }
}
