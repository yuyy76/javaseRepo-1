package cn.yyy.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "郭靖";
        //person.age = 32;    //直接访问private内容是错误的
        person.setAge(20);
        person.show();
    }
}
