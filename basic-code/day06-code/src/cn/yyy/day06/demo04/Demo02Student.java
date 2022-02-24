package cn.yyy.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造
        Student stu2 = new Student("欧阳锋",36);

        System.out.println("姓名："+stu2.getName());
        System.out.println("年龄："+stu2.getAge());

        //如果需要改变对象当中的成员变量的数据内容
        stu2.setAge(37);
        System.out.println(stu2.getAge());
    }
}
