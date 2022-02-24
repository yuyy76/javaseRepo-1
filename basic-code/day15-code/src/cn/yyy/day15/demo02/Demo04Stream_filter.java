package cn.yyy.day15.demo02;

import java.util.stream.Stream;

/*
 Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
 Stream<T> filter(Predicate<? super T> predicate);
 filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
 Predicate中的抽象方法:
    boolean test(T t);
 */
public class Demo04Stream_filter {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "周芷若","赵敏","张无忌");
        //对Stream流中的元素进行过滤,只要姓张的人
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //遍历stream1流
        stream1.forEach((String name)->{
            System.out.println(name);
        });

        /**
         * Stream流属于管道流,只能被消费(使用)一次,第一个Stream流调用完毕方法,数据就会流转到
         * 下一个Stream流上,而这时第一个Stream流已经使用完毕,就会关闭了,所以第一个Stream流
         * 就不能再调用方法了. 再调用会抛异常如下:
         * IllegalStateException: stream has already been operated upon or closed
         */
        //Stream流已经调用了filter了,下面再遍历Stream流试试看
        stream.forEach((String name)->{
            System.out.println(name);
        });//IllegalStateException: stream has already been operated upon or closed





    }
}
