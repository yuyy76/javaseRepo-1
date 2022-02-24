package cn.yyy.day12.demo06;

import java.util.ArrayList;

/*
增强for循环，底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写，是JDK1.5之后出现的新特性

public interface Collection<E> extends Iterable<E>：所有的单列集合都可以使用增强for

public interface Iterable<T>：实现这个接口允许对象成为 "foreach" 语句的目标。

增强for循环，用来遍历集合和数组
格式：
    for(集合/数组的数据类型 变量名：集合名/数组名){
        sout(变量名)
    }
注意事项：新for循环必须有被遍历的目标。目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。

 */
public class Demo02Foreach {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("金毛狮王");
        list.add("紫衫龙王");
        list.add("白眉鹰王");
        list.add("青翼蝠王");
        for (String str :
                list) {
            System.out.println(str);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
