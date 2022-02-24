package cn.yyy.day15.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 练习:集合元素处理(将上一个练习以流方式优化)
    现在有两个ArrayList集合存储队伍当中的多个成员姓名,要求依次进行以下若干操作步骤:
    1、第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
    2、第一个队伍筛选之后只要前3个人；存储到一个新集合中。
    3、第二个队伍只要姓张的成员姓名；存储到一个新集合中。
    4、第二个队伍筛选之后不要前2个人；存储到一个新集合中。
    5、将两个队伍合并为一个队伍，存储到一个新集合中。
    6、根据姓名创建Person对象；存储到一个新集合中。
    7、打印整个队伍的Person对象信息。
 */
public class Demo11StreamTest {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("汉库克");
        one.add("索隆");
        one.add("克洛克达尔");
        one.add("白胡子");
        one.add("布鲁克");
        one.add("米霍克");
        one.add("罗");
        one.add("艾斯");
        //1、第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。   //filter
        //2、第一个队伍筛选之后只要前3个人；存储到一个新集合中。  //limit
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);

        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("张松溪");
        two.add("张召重");
        two.add("令狐冲");
        two.add("张无忌");
        two.add("独孤求败");
        two.add("郭靖");
        two.add("张三丰");
        two.add("张翠山");
        //3、第二个队伍只要姓张的成员姓名；存储到一个新集合中。   //filter
        //4、第二个队伍筛选之后不要前2个人；存储到一个新集合中。  //skip
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);

        //5、将两个队伍合并为一个队伍，存储到一个新集合中。 //concat
        //6、根据姓名创建Person对象；存储到一个新集合中。   //map
        //7、打印整个队伍的Person对象信息。  //forEach
        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(p-> System.out.println(p));

    }
}
