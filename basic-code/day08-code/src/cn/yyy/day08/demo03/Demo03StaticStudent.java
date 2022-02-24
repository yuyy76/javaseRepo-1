package cn.yyy.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称调用
        Student.room = "寒山寺";

        Student one = new Student("令狐冲", 20);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        //静态推荐用类（Student.room）而不推荐用(one.room)
        System.out.println("one的教室："+Student.room);

        Student two = new Student("任盈盈", 18);
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        //静态推荐用类（Student.room）而不推荐用(one.room)
        System.out.println("two的教室："+Student.room);


    }
}
