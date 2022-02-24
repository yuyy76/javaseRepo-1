package cn.yyy.day08.demo03;

/**
 * 一旦用了static关键字，那么这样的内容不再属于对象自己，而是属于类的，
 * 所以凡是本类的对象，都共享同一份
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。
 * 多个对象共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {

        Student two = new Student("黄蓉", 16);
        two.room = "桃花岛";
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，住在：" + two.room
                + ",学号：" + two.getId());


        Student one = new Student("郭靖", 19);
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，住在：" + one.room
                + ",学号：" + one.getId());


    }
}
