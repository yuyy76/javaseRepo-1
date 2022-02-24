package cn.yyy.day06.demo01;

/**
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
 * <p>
 * 1、导包：也就是指出使用的类，在什么位置。
 * import 包名称.类名称;
 * import cn.yyy.day06.demo01.Student
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写
 * <p>
 * 2、创建，格式：
 * 类名称 对象名 = new 类名称()；
 * Student stu = new Student();
 * <p>
 * 3、使用，分为两种情况
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * 也就是，想用谁，就用 对象名.谁
 *
 * 注意事项：
 * 如果成员变量没有赋值，那么会有一个默认值
 */
public class Demo02Student {
    public static void main(String[] args) {
        //1、导包
        //我需要使用Student类，和我自己位于同一个包下，可以省略不写

        //2、创建
        //根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        //3、使用其中的成员变量
        System.out.println(stu.name);
        System.out.println(stu.age);

        System.out.println("================");

        //改变对象当中的成员变量数值内容
        stu.name = "周杰伦";
        stu.age = 18;
        System.out.println(stu.name + stu.age);

        System.out.println("================");

        //4、使用对象的成员方法
        stu.eat();
        stu.study();
        stu.sleep();


    }

}
