package cn.yyy.day07.demo05;

import java.util.ArrayList;

/**
 * 题目：自定义4个学生对象，添加到集合，并遍历
 * 思路：
 * 1、定义学生类
 * 2、new4个学生对象
 * 3、添加到集合
 * 4、遍历
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("东邪",20);
        Student stu2 = new Student("西毒",20);
        Student stu3 = new Student("南帝",21);
        Student stu4 = new Student("北丐",21);
/*

        stu1.setName("东邪");
        stu1.setAge(18);
        stu2.setName("西毒");
        stu2.setAge(18);
        stu3.setName("南帝");
        stu3.setAge(18);
        stu4.setName("北丐");
        stu4.setAge(18);
*/

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge());

        }
    }
}
