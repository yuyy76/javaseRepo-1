package cn.yyy.day07.demo04;

import java.util.ArrayList;

/**
 * 数组的长度不可以发生改变，
 * 但是Arraylist集合的长度是可以随意变化的。
 * <p>
 * 对于ArrayList来说，有一个尖括号<E>代表泛型。
 * 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
 * 注意：泛型只能是引用类型，不能是基本类型
 *
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
 * 如果内容是空，得到的是空的中括号：[]
 *
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list,
        // 里面装的全都是String字符串类型的数据
        //备注：从JDK1.7开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据，需要使用add方法
        list.add("钟楚红");
        list.add("张曼玉");
        list.add("王祖贤");
        System.out.println(list);

        //list.add(100);  //错误写法，因为创建时泛型已经限定为添加的元素为字符串才行



    }
}
