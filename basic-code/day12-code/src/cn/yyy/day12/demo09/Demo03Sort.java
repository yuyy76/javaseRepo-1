package cn.yyy.day12.demo09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T> list,Comparator<? super T> c):将集合中元素按照指定规则排序。

  Comparator和Comparable的区别
    Comparable：自己(this)和别人(compareTo方法传递的参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
    Comparator：相当于找一个第三方的裁判，比较两个
   Comparator的排序规则： 参数 o1-o2，前面减后面，升序排序；反之降序


 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;//前面减后面，升序排序 [1, 2, 3]
                return o2 - o1;//后面减前面，降序排序   [3, 2, 1]
            }
        });

        System.out.println(list01);

        //比较自定义对象
        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("令狐冲", 20));
        list02.add(new Student("a田伯光", 24));
        list02.add(new Student("林平之", 18));
        list02.add(new Student("b不戒和尚", 24));
        list02.add(new Student("令狐冲", 19));
        System.out.println(list02);

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按年龄升序排列
//                return o1.getAge() - o2.getAge();

                //可以组合使用，例如：
                //如果年龄相同，按照姓名第一个字首字母比较
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }

                return result;
            }
        });
        System.out.println(list02);

    }
}
