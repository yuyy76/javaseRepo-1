package cn.yyy.day12.demo08;

import java.util.HashSet;

/*
 使用HashSet集合来存储自定义类型的元素

 set集合要保证元素唯一：
    存储的元素（String,Integer,...Student,Person）,必须重写hashCode方法和equals方法！
 本例要求：
    同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo04HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合，用来存储PersonHashSet
        HashSet<PersonHashSet> set = new HashSet<>();
        PersonHashSet p1 = new PersonHashSet("袁紫衣",18);
        PersonHashSet p2 = new PersonHashSet("袁紫衣",18);
        PersonHashSet p3 = new PersonHashSet("袁紫衣",19);
        System.out.println(p1.hashCode());//717356484
        System.out.println(p2.hashCode());//1595212853
        System.out.println(p1.equals(p2));//false

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
