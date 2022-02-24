package cn.yyy.day10.demo06;
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


public abstract class Animal {
    public abstract void eat();
}
