package cn.yyy.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("黄蓉");
        stu1.setAge(18);
        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());
        System.out.println("==================");
        Student stu2 = new Student("赵敏",19);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());


    }
}
