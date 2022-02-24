package cn.yyy.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("谢逊");
        stu.setAge(16);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName()
                + "; 年龄:" + stu.getAge() + "; 是男的吗"
                + stu.isMale());


    }
}
