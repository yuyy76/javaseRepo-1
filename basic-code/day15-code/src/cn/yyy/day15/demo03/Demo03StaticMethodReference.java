package cn.yyy.day15.demo03;

/**
 * 通过类名引用静态成员方法
 * 使用前提：类已经存在，静态方法也已经存在，就可以通过类名直接引用静态成员方法
 */
public class Demo03StaticMethodReference {
    //定义一个方法，方法的参数传递要计算绝对值的整数，和函数式接口Calcable
    public static int method(int number,Calcable c){
        return c.calcAbs(number);
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，和Lambda表达式
        int num = method(-10, (n) -> {
            //对参数进行绝对值的计算并返回结果
            return Math.abs(n);
        });
        System.out.println(num);

        /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        int i = method(-38, Math::abs);
        System.out.println(i);

    }
}
