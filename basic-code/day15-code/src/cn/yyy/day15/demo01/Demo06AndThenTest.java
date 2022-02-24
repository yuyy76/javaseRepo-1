package cn.yyy.day15.demo01;

import java.util.function.Consumer;

/*
 练习：
    字符串数组当中存有多条西悉尼，请按照格式"姓名：xx，性别：xx。"的格式将信息打印出来
    要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
    将打印性别的动作作为第二个Consumer接口的Lambda实例
    将两个Consumer接口按照顺序"拼接"到一起
 */
public class Demo06AndThenTest {
    //定义一个方法，方法的参数传递一个字符串和两个Consumer接口，Consumer接口的泛型使用字符串
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        //遍历字符串数组
        for (String s : arr) {
            //使用andThen方法，把两个Consumer接口连接到一起，再进行消费
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        //定义一个字符串类型的数组
        String[] arr = {"路飞,男","索隆,男","娜美,女","乌索普,男","香吉士,男","乔巴,男","罗宾,女"};

        //调用printInfo方法，传递一个字符串，两个lambda表达式
        printInfo(arr, (m) -> {
            //消费方式：对m进行切割，获取姓名，按照指定格式输出
            String name = m.split(",")[0];
            System.out.print("姓名："+name);
                }, (m) -> {
                    //消费方式：对m进行切割，获取性别，按照指定格式输出
                    String male = m.split(",")[1];
                    System.out.println("，性别："+male+"。");
                }
        );
    }
}
