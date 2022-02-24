package cn.yyy.day15.demo02;

import java.util.ArrayList;

/*
 练习:集合元素处理(传统方式)
    现在有两个ArrayList集合存储队伍当中的多个成员姓名,要求使用传统的for循环(或
    增强for循环)依次进行以下若干操作步骤:
    1、第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
    2、第一个队伍筛选之后只要前3个人；存储到一个新集合中。
    3、第二个队伍只要姓张的成员姓名；存储到一个新集合中。
    4、第二个队伍筛选之后不要前2个人；存储到一个新集合中。
    5、将两个队伍合并为一个队伍，存储到一个新集合中。
    6、根据姓名创建Person对象；存储到一个新集合中。
    7、打印整个队伍的Person对象信息。
 */
public class Demo10StreamTest {
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

        //1、第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        ArrayList<String> oneList1 = new ArrayList<>();
        for (String name : one) {
            if (name.length()==3){
                oneList1.add(name);
            }
        }
        //2、第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        ArrayList<String> oneList2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            oneList2.add(oneList1.get(i)); //i = 0,1,2
        }
        //3、第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        ArrayList<String> twoList1 = new ArrayList<>();
        for (String name : two) {
            if (name.startsWith("张")){
                twoList1.add(name);
            }
        }
        //4、第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        ArrayList<String> twoList2 = new ArrayList<>();
        for (int i = 2; i < twoList1.size() ; i++) {
            twoList2.add(twoList1.get(i));//i 不包含 0,1
        }
        //5、将两个队伍合并为一个队伍，存储到一个新集合中。
        ArrayList<String> all = new ArrayList<>();
        all.addAll(oneList2);
        all.addAll(twoList2);
        //6、根据姓名创建Person对象；存储到一个新集合中。
        ArrayList<Person> p = new ArrayList<>();
        for (String name : all) {
            p.add(new Person(name));
        }
        //7、打印整个队伍的Person对象信息。
        for (Person person : p) {
            System.out.println(person);
        }

    }
}
