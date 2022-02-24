package cn.yyy.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/*
接口作为方法的参数和或返回值

java.util.list正是ArrayList所实现的接口。
 */
public class DemoInterface {

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    //参数进来一个空集合，返回集合就有东西了
    public static List<String> addNames(List<String> list){
        list.add("东邪");
        list.add("西毒");
        list.add("南帝");
        list.add("北丐");
        return list;
    }



}
