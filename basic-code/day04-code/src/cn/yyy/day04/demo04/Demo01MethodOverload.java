package cn.yyy.day04.demo04;

/**
 * 对于功能类似的方法来说，因为参数列表不一样，却要记住那么多不同的方法名称，太麻烦。
 * 方法的重载（overload）:多个方法的名称一样，但是参数列表不一样。
 * 好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        int result = sum(11,37,49,56);
        System.out.println(result);
    }

    public static int sum(int a,int b){
        System.out.println("有两个参数的方法执行");
        return a+b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("有三个参数的方法执行");
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        System.out.println("有四个参数的方法执行");
        return a+b+c+d;
    }

}
