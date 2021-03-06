package cn.yyy.day12.demo02;

/*
    java.util.Date：表示日期和时间的类，类Date表示特定的瞬间，精确到毫秒/
    特定的瞬间：一个时间点 2088-08-08 09:33:33:333
    毫秒值的作用：可以对时间和日期进行计算
    2088-08-08 到 2022-03-03 中间一共有多少天？ 可以日期转换为毫秒计算，完毕后把毫秒转换为日期

    把日期转换为毫秒：
        当前的日期：2022-03-03
        时间原点(0毫秒)：1970年1月1日00:00:00（英国格林威治）
        就是计算当前日期到时间原点之间一共经历了多少毫秒(1642582236227L)
      注意：中国属于东八区，会把时间增加8小时  1970年1月1日08:00:00

    把毫秒转换为日期：
        1天 = 24*60*60=86400秒 = 86400*1000毫秒

 */
public class Demo01Date {

    public static void main(String[] args) {
        //获取当前系统时间到1970年1月1日00:00:00经历了多少毫秒
        System.out.println(System.currentTimeMillis());
    }

}
