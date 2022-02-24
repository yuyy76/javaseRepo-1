package cn.yyy.day14.demo07;

import java.io.Serializable;

/*
 序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的
        类将无法使其任何状态序列化或反序列化。
 Serializable接口也叫标记型接口
    要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
    当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记：
        有：就可以序列化和反序列化
        没有：就会抛出NotSerializableException异常
 类似：
    去市场买肉->肉上有一个蓝色章(检测合格)->放心购买->买回来怎么吃就随意了

    Serializable接口 叫标记型接口 接口源码里面什么功能也没有

    static关键字：静态关键字
        静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
        被static修饰的成员变量不能被序列化的，序列化的都是对象
            private static int age;
            oos.writeObject(new Person("张无忌",20));
            Object o = ois.readObject();
            Person{name='张无忌', age=0}   //age=0 成员变量的默认值0
        所以静态成员变量是不能被序列化的

    transient关键字：瞬态关键字
        被transient修饰的成员变量也是不能被序列化的
            private transient int age;
            oos.writeObject(new Person("张无忌",20));
            Object o = ois.readObject();
            Person{name='张无忌', age=0}
 */

public class Person implements Serializable {

    //显式声明其自己的 serialVersionUID
    private static final long serialVersionUID = 36L;

    private String name;
//    private static int age;
    private int age;
//    private transient int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
