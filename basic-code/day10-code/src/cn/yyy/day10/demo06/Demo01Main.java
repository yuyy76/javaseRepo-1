package cn.yyy.day10.demo06;
/*
向上转型一定是安全的，没有问题的，正确的，但是有一个弊端：
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。
解决方案：用对象的向下转型，【还原】。
格式：子类名称 对象名 = (子类名称)父类对象;
含义：将父类对象，【还原】成为本来的子类对象。
注意事项：
1、必须保障对象本来创建的时候，就是猫，才能向下转型成为猫
2、如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错。
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat();  //本来创建的时候是一只猫
        animal.eat();

//        animal.catchMouse();    //错误写法

        //向下转型，进行“还原”动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫，现在非要当作狗
        Dog dog = (Dog)animal;  //编译不会报错，但是运行会出现异常：ClassCastException,类转换异常

    }
}
