package cn.yyy.day12.demo08;
/*
 哈希值：是一个十进制的整数，由系统随即给出（就是对象的地址值，是一个逻辑地址，是模拟出来
 得到的地址，不是数据实际存储的物理地址）。在Object类有一个方法，可以获取对象的哈希值：
    int hashCode() ：返回该对象的哈希码值。
 hashCode方法的源码：
    public native int hashCode();
    native:代表该方法调用的是本地操作系统的方法

 */
public class Demo02HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//717356484      1

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//1595212853     1

        /**
         * toString方法的源码：
         *  return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);//cn.yyy.day12.demo08.Person@2ac1fdc4        1
        System.out.println(p2);//cn.yyy.day12.demo08.Person@5f150435        1
        System.out.println(p1==p2);//false

        /**
         *  String类的哈希值
         *      String类重写Object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println(s1==s2);
        //以下两各元素哈希冲突：1179395 元素不同，哈希值相同
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());





    }
}
