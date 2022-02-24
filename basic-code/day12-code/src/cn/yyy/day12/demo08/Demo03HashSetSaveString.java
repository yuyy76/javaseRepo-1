package cn.yyy.day12.demo08;

import java.util.HashSet;

/*
 Set集合不允许存储重复元素的原理

 Set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法，判断
 元素是否重复

    前提：存储的元素必须重写hashCode方法和equals方法。

 */
public class Demo03HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");

        /**
         * add方法会调用s1的hashCode方法，计算字符串"abc"的哈希值(96354)，在集
         * 合set中找有没有96354这个哈希值的元素，发现没有，就会把s1存到set集合中
         */
        set.add(s1);
        /**
         * add方法会调用s2的hashCode方法，计算字符串"abc"的哈希值(96354)，在集
         * 合set中找有没有96354这个哈希值的元素，发现有（哈希冲突）,s2会调用equals
         * 方法和哈希值相同的元素进行比较：s2.equals(s1)，返回true。两个元素的哈希值
         * 相同，equals方法返回true，认定两个元素相同，就不会把s2存储到集合中。
         */
        set.add(s2);
        /**
         * add方法会调用"重地"的hashCode方法，计算字符串"重地"的哈希值(1179395)，在
         * 集合set中找有没有1179395这个哈希值的元素，发现没有，就会把"重地"存到set集合中
         */
        set.add("重地");
        /**
         * add方法会调用"通话"的hashCode方法，计算字符串"通话"的哈希值(1179395)，在
         * 集合set中找有没有1179395这个哈希值的元素，发现有（哈希冲突），"通话"会调用equals
         * 方法和哈希值相同的元素进行比较："通话".equals("重地"),返回false。两个元素的哈希值
         * 相同，equals方法返回false，认定两个元素不同，就会把"通话"存储到集合中，且挂在与”重地“
         * 相同的链表/红黑树下，因为两个元素的哈希值相同。
         */
        set.add("通话");

        set.add("abc");

        System.out.println(set);//[重地, 通话, abc]

    }
}
