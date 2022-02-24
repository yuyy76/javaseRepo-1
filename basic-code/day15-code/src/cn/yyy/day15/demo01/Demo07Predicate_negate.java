package cn.yyy.day15.demo01;

import java.util.function.Predicate;

/*
 逻辑表达式：可以连接多个判断条件
 &&：与运算符，有false则false
 ||：或运算符，有true则true
 !：非(取反)运算符，非真则假，非假则真

 需求：判断一个字符串长度是否大于5,
    如果字符串的长度大于5，那返回false
    如果字符串的长度不大于5，那返回true

 Predicate接口中有一个方法negate，表示 取反的意思
 default Predicate<T> negate​(){
    return (t)->!test(t);
 }
 方法内部的两个判断条件也是使用||运算符连接起来的
 */
public class Demo07Predicate_negate {
    /**
     * 定义一个方法,方法的参数传递一个String类型的字符串
     * 使用Predicate接口，判断字符串的长度是否大于5
     */
    public static boolean checkString(String s, Predicate<String> pre){
//        return !pre.test(s);
       return pre.negate().test(s);//等效于上一行代码
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "abc";
        //调用checkString方法,对字符串进行校验，参数传递字符串和Lambda表达式
        boolean b = checkString(s, (String str) -> {
            //判断字符串的长度是否大于5,并返回结果
            return str.length()>5;
        });

        System.out.println(b);

    }

}
