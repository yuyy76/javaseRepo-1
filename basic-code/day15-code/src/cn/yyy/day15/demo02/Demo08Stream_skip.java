package cn.yyy.day15.demo02;

import java.util.stream.Stream;

/*
 Stream流中的常用方法_skip:用于跳过Stream流中的元素 延迟方法
 如果希望跳过前几个元素,可以使用skip方法获取一个截取之后的新流
 Stream<T> skip(long n)
    如果流的当前长度大于n,则跳过前n个;否则将会得到一个长度为0的空流
 */
public class Demo08Stream_skip {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr = {"令狐冲","任盈盈","风清扬","任我行","岳灵珊","岳不群","林平之"};
        Stream<String> stream1 = Stream.of(arr);
        //使用skip方法跳过前4个元素
        Stream<String> stream2 = stream1.skip(4);
        //遍历stream2流
        stream2.forEach((String name)->{
            System.out.println(name);
        });

        //遍历stream1流,抛IllegalStateException异常
        stream1.forEach(name-> System.out.println(name));

    }
}
