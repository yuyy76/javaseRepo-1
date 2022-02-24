package cn.yyy.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();   //错误！
//        Dog dog = new Dog();    //错误！也是抽象类

        Dog2Ha ha = new Dog2Ha();
        ha.eat();
        ha.sleep();

        System.out.println("=============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();


    }
}
