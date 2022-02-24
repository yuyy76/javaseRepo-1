package cn.yyy.day14.demo01;

import java.util.ArrayList;

/*
 Lambda表达式：是可推导，可以省略的
 凡是根据上下文推导出来的内容，都可以省略书写
 可以省略的内容：
    1、(参数列表)：括号中参数列表的数据类型，可以省略不写
    2、(参数列表)：括号中的参数如果只有一个，那么类型和()都可以省略
    3、{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略（{},return,分号）
        注意：要省略的话，则 {},return,分号 三个必须一起省略

 Lambda的使用前提：
    1、使用Lambda必须具有接口，且要求接口中“有且仅有一个”抽象方法。
      无论是JDK内置的Runnable、Comparator接口还是自定义的接口，只有当接口中的抽象方法存在
      且唯一时，才可以使用Lambda
    2、使用Lambda必须具有上下文推断。也就是方法的参数或局部变量必须为Lambda对应的接口
      类型，才能使用Lambda作为该接口的实例。
    备注：有且仅有一个抽象方法的接口，称为“函数式接口”

 */
public class Demo06ArrayList {
    //JDK1.7版本之前，创建集合对象必须把前后的泛型都写上
    ArrayList<String> list01 = new ArrayList<String>();

    //JDK1.7版本之后，=号后面的泛型可以省略，后面的泛型可以根据前边的泛型推导出来
    ArrayList<String> list02 = new ArrayList<>();


}
