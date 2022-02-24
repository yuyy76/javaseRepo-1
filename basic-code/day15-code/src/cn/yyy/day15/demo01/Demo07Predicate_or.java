package cn.yyy.day15.demo01;

import java.util.function.Predicate;

/*
 逻辑表达式：可以连接多个判断条件
 &&：与运算符，有false则false
 ||：或运算符，有true则true
 !：非(取反)运算符，非真则假，非假则真

 需求：判断一个字符串，有两个判断条件
    1、判断字符串的长度是否大于5
    2、判断字符串中是否包含a
 两个条件满足一个即可，我们就可以使用||运算符连接两个条件

 Predicate接口中有一个方法or，表示 或者 关系，也可以用于连接两个判断条件
 default Predicate<T> or​(Predicate<? super T> other){
    Objects.requireNonNull(other);
    return (t)->this.test(t) || other.test(t);
 }
 方法内部的两个判断条件也是使用||运算符连接起来的
 */
public class Demo07Predicate_or {
    /**
     * 定义一个方法,方法的参数传递一个String类型的字符串
     * 传递两个Predicate接口，泛型使用String
     *    一个用于判断字符串的长度是否大于5
     *    一个用于判断字符串中是否包含a
     *    满足一个条件即可
     */
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
//        return pre1.test(s) || pre2.test(s);
       return pre1.or(pre2).test(s);//等价于上一行代码
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "bcdefg";
        //调用checkString方法对字符串进行校验，参数传递字符串和两个Lambda表达式

        Boolean b = checkString(s,(String str)->{
            //判断字符串长度是否大于5
            return str.length()>5;
        },(String str)->{
            //判断字符串中是否包含aa
            return str.contains("a");
        });

        System.out.println(b);

    }

}
