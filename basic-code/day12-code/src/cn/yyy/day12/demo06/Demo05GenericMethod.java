package cn.yyy.day12.demo06;
/*
 测试含有泛型的方法
 */
public class Demo05GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /**
         * 调用含有泛型的方法method01
         * 传递什么类型，泛型就是什么类型
         */
         gm.method01(10);
         gm.method01(3.14);
         gm.method01("独孤求败");
         gm.method01(false);

         gm.method02("静态方法，不建议创建对象使用");

         //静态方法，通过类名.方法名(参数)可以直接使用
        GenericMethod.method02(3.14);


    }
}
