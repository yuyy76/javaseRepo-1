package cn.yyy.day15.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 Stream流中的常用方法_limit:用于截取Stream流中的元素 延迟方法
 limit方法可以对流进行截取,只取用前n个.方法签名:
 Stream<T> limit​(long maxSize)
    参数是一个long类型,如果集合当前长度大于参数则进行截取;否则不进行操作
 limit​方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以
    可以继续调用Stream流中的其他方法
 */
public class Demo07Stream_limit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr = {"令狐冲","任盈盈","风清扬","任我行","岳灵珊","岳不群","林平之"};
        Stream<String> stream1 = Stream.of(arr);
        //使用limit对Stream流中的元素进行截取,只要前4个元素
        Stream<String> stream2 = stream1.limit(4);
        //遍历stream2流
        stream2.forEach((String name)->{
            System.out.println(name);
        });

        //遍历stream1流,抛IllegalStateException异常
        stream1.forEach(name-> System.out.println(name));

    }
}
