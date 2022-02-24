package cn.yyy.day15.demo02;

import java.util.stream.Stream;

/*
 Stream流中的常用方法_concat:用于把流组合到一起 延迟方法
 如果有两个流,希望合并成为一个流,那么可以使用Stream接口的静态方法concat
 static <T> Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo09Stream_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "周芷若","赵敏","张无忌");
        //获取一个Stream流
        String[] arr = {"令狐冲","任盈盈","风清扬","任我行","东方不败"};
        Stream<String> stream2 = Stream.of(arr);
        //把以上两个流组合为一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat流
        concat.forEach(name-> System.out.println(name));

        //遍历stream1流->抛异常
//        stream1.forEach(name-> System.out.println(name));
        //遍历stream2流->抛异常
//        stream2.forEach(name-> System.out.println(name));
        //再次遍历concat->抛异常
//        concat.forEach(name-> System.out.println(name));
    }
}
