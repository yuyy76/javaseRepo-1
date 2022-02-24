package cn.yyy.day10.demo05;
/*
多态中成员方法的使用特点：
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。
口诀：
编译看左边，运行看右边

对比一下：
成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边

 */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();   //父子都有，优先用子
        obj.methodFu(); //子类没有，父类有，向上找到父类

        //编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi(); //错误写法
    }
}


/*
好处：无论右边new的时候换成哪个子类对象，等号左边调用方法都不会变化（父类方法）,如：
Employee one = new Teacher();
one.work();
Employee two = new Assistant();
two.work();
Employee three = new Guarder();
three.work();
...
 */

/*
1、对象的向上转型，其实就是多态写法：
格式：父类名称 对象名 = new 子类名称();       Animal animal = new Cat();
含义：右侧创建一个子类对象，把它当作父类来看待使用。  创建了一只猫，把它当作动物来看待，没问题。
注意事项：向上转型一定是安全的。从小范围转向了大范围，从小范围的猫，向上转换成为更大范围的动物。

类似于：
double num = 100;   //正确，   int --> double,自动类型转换。



 */