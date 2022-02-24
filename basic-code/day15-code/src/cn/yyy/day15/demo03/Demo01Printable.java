package cn.yyy.day15.demo03;

public class Demo01Printable {
    //定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable p){
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda表达式
        printString((String s)->{
            System.out.println(s);
        });

       /*
            分析：
                Lambda表达式的目的，打印参数传递的字符串
                把参数s，传递给了System.out对象，调用out对象中的方法println对
                字符串进行了输出
                注意：
                    1、System.out对象是已经存在的
                    2、println方法也是存在的
                所以我们可以使用方法引用来优化Lambda表达式
                可以使用System.out方法直接引用(调用)println方法
        */
        printString(System.out::print);


        /*
            语义分析：
                例如上例中，System.out对象中有一个重载的println(String)方法恰好就是我们所
                需要的。那么对于printString方法的函数式接口参数，对比下面两种写法，完全等效：
                - Lambda表达式写法：s -> System.out.println(s);
                - 方法引用写法：System.out::println
                第一种语义是：拿到参数之后经Lambda之手，继而传递给System.out.println方法去
                处理。
                第二种等效写法的语义是指：直接让System.out中的println方法来取代Lambda。
                两种写法的执行效果完全一样，而第二种方法引用的写法复用了已有的方案，更加简洁。
                注：Lambda中传递的参数一定是方法引用中的那个方法可以接收的类型，否则会抛出异常。

         */

    }
}
