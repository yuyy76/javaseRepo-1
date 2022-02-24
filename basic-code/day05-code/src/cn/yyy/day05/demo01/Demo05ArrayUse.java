package cn.yyy.day05.demo01;

/**
 * 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
 * 如果是整数类型，那么默认为0
 * 如果是浮点类型，那么默认为0.0
 * 如果是字符类型，那么默认为'\u0000'
 * 如果是布尔类型，那么默认为false
 * 如果是引用类型，那么默认为null
 * <p>
 * 注意事项：
 * 静态初始化也有默认值的过程，只是系统自动马上将默认值替换成为大括号当中的具体值
 * <p>
 * <p>
 * <p>
 * 内存划分的知识：
 * java的内存需要划分成为5个部分：
 * 1、栈内存（stack）：存放的都是方法中的局部变量
 * ***局部变量:方法的参数，或是方法{}内部的变量
 * ***作用域：一旦超出作用域，立刻从栈内存当中小时
 * 2、堆内存(Heap)：凡是new出来的东西，都在堆当中
 * ***堆内存里面的东西都有一个地址值：16进制
 * ***堆内存里面的数据，都有默认值，规则：
 * ******如果是整数类型，那么默认为0
 * ******如果是浮点类型，那么默认为0.0
 * ******如果是字符类型，那么默认为'\u0000'
 * ******如果是布尔类型，那么默认为false
 * ******如果是引用类型，那么默认为null
 * 3、方法区(Method Area)：存储.class相关信息，包含方法的信息。
 * <p>
 * 4、本地方法栈(Native Method Stack)：与操作系统相关
 * 5、寄存器（Pc Register）:与CPU相关
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        //内存地址值
        System.out.println(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("=============");
        //将数据123赋值交给数字当中的1号元素
        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
