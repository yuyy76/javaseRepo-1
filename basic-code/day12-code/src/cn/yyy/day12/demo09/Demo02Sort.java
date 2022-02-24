package cn.yyy.day12.demo09;

import java.util.ArrayList;
import java.util.Collections;

/*
 java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意事项：
        sort(List<T> list)使用前提
        被排序的集合里边存储的元素，必须实现Comparable,重写接口中的方法compareTo定义排序的规则
      Comparable接口的排序规则:
        自己(this)-参数：升序；   反之：参数-自己(this) 降序
        例如：return this.getAge() - o.getAge();//年龄升序排序

 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,2);
        System.out.println(list01);

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
        Collections.sort(list01);//只能传list集合不能传set集合;另外静态方法可以直接通过类名调用
        System.out.println(list01);//默认是升序

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        Collections.addAll(list03,new Person("乔峰",22),
                new Person("虚竹",21),new Person("段誉",20));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);





    }
}
