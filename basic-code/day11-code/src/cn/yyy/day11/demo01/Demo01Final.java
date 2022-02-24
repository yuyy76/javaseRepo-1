package cn.yyy.day11.demo01;
/*
final关键字代表最终、不可改变的。
常见四种用法：
1、可以用来修饰一个类
2、可以用来修饰一个方法
3、可以用来修饰一个局部变量
4、可以用来修饰一个成员变量
 */
public class Demo01Final {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        System.out.println("============");

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //一次赋值，终生不变
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 300;   //错误写法
//        num2 = 200;     //错误写法

        //正确写法，只要保证有位移一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量中的地址值不可改变
        Student stu1 = new Student("郭靖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("黄蓉");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("====================");

        final Student stu2 = new Student("南帝");
        System.out.println(stu2.getName());
        //final的引用类型变量，其中地址值不可改变，错误写法
//        stu2 = new Student("北丐");
        //但是值可以改变，如下写法
        stu2.setName("北丐");
        System.out.println(stu2.getName());

    }

}
