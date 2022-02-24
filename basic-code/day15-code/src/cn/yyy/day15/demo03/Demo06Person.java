package cn.yyy.day15.demo03;

/**
 * 类的构造器(构造方法)引用
 */
public class Demo06Person {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.buildPerson(name);
        System.out.println(person.getName());
    }

    //静态方法只能调用静态方法，所以上面方法也得是静态方法
    public static void main(String[] args) {
        //调用printName方法，方法的参数PersonBuilder接口是一个函数式接口，可以传递Lambda表达式
        printName("娜美",(String name)->{
            return new Person(name);
        });

        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name)已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        //使用Person类的带参构造方法，通过传递的姓名创建对象
        printName("罗宾",Person::new);

    }

}
