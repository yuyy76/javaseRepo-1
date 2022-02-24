package cn.yyy.day08.demo04;

/**
 * 题目：
 * 计算在-10.8到5.9之间，绝对值大于6，或者小于2.1的整数有多少个？
 * <p>
 * 分析：
 * 1、既然已经确定了范围，for循环
 * 2、起点位置-10.8应该转换为-10，两种办法：
 * 2.1、可以使用Math.ceil方法，向上（向正方向）取整
 * 2.2、可以强转为int，自动舍弃所有小数位
 * 3、每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
 * 4、如何拿到绝对值：Math.abs
 * 5、一旦发现了一个数字，需要让计数器++进行统计
 * <p>
 * 备注：如果使用ceil方法，-10.8可以变成-10.0，注意double也是可以进行++的。
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = Math.ceil(-10.8);
        double max = 5.9;
        int count = 0;
        for (double i = min; i < max; i++) {
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.print(i);
                count++;
            }
        }
        System.out.println("共有 " + count + " 个");
    }
}


/**
 * 面向对象的三大特性：封装性private、继承性、多态性
 * 继承是多态的前提，如果没有继承，就没有多态。
 * 师父会多少武功、大徒弟都会、小徒弟也都会。
 * 继承主要解决的问题就是：【共性提取】。
 * 父类：也可以叫基类、超类
 * 子类：也可以叫做派生类
 * 继承关系当中的特点：
 * 1、子类可以拥有父类的”内容“
 * 2、子类还可以拥有自己专有的内容。
 */
