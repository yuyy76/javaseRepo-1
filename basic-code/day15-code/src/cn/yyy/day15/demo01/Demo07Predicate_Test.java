package cn.yyy.day15.demo01;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 练习：集合信息筛选
 数组当中有多条"姓名+性别"的信息如下：
 String[] arr = {"路飞,男","佩罗娜,女","索隆,男","娜美,女","女帝,女","香吉士,男","蕾贝卡,女","罗宾,女"};
 请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
 需要同时满足两个条件：
    1、必须为女生
    2、姓名为2个字

 分析：
    1、有两个判断条件，所以需要使用两个Predicate接口，对条件进行判断
    2、必须同时满足两个条件，所以可以使用and方法连接两个判断
 */
public class Demo07Predicate_Test {
    /**
     * 定义一个方法,方法的参数传递一个包含人员信息的数组
     * 传递两个Predicate接口，用于对数组中的信息进行过滤，泛型使用String
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        //定义一个ArrayList集合,存储过滤之后的信息
        ArrayList<String> list = new ArrayList<>();
        //遍历数组，获取数组中的每一条信息
        for (String s : arr) {
            //使用Predicate接口中的方法test对获取到的字符串进行判断
            boolean b = pre1.and(pre2).test(s);
            //对得到的布尔值进行判断
            if (b){
                //条件成立，两个条件都满足，把信息存储到ArrayList集合中
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //定义一个存储字符串的数组
        String[] array = {"路飞,男","佩罗娜,女","索隆,男","娜美,女","女帝,女","香吉士,男","蕾贝卡,女","罗宾,女"};

        //调用filter方法对字符串进行校验，参数传递字符串和两个Lambda表达式
        ArrayList<String> list = filter(array, (String s) -> {
            //获取字符串中的性别，判断是否为女生
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            //获取字符串中的姓名，判断长度是否为2个字
            return s.split(",")[0].length() == 2;
        });
        //遍历集合
        for (String s : list) {
            System.out.println(s);
        }
    }
}
