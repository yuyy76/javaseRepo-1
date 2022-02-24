package cn.yyy.day14.demo01;

import java.util.Arrays;
import java.util.Comparator;

/*
 Lambda表达式有参数有返回值的练习
 需求：
    使用数组存储多个Person对象
    对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo04Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
            new Person("乔峰",32),
            new Person("虚竹",30),
            new Person("段誉",28),
        };
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge() - o1.getAge();
        });


        //优化省略Lambda表达式：
        // 参数类型省略；
        // {}中的代码只有一行，{},return,分号 三个必须一起省略
        Arrays.sort(arr,(o1, o2)-> o2.getAge() - o1.getAge() );


        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }

    }
}
