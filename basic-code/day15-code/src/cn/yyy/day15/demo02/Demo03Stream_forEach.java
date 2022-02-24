package cn.yyy.day15.demo02;

import java.util.stream.Stream;

/*
 Stream流中的常用方法_forEach
 void forEach​(Consumer<? super T> action);
 该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
 Consumer接口是一个消费性的函数式接口，可以传递Lambda表达式，消费数据

 简单记：
    forEach方法，用来遍历流中的数据
    是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 */
public class Demo03Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("路飞", "艾斯", "罗", "索隆", "山治", "米霍克", "马尔科");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
