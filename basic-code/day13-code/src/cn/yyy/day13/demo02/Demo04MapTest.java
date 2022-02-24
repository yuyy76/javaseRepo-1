package cn.yyy.day13.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
    练习：
        计算一个字符串中每个字符出现的次数
    分析：
        1、使用Scanner获取用户输入的字符串
        2、创建Map集合，key是字符串中的字符，value是字符的个数
        3、遍历字符串，获取每一个字符
        4、使用获取到的字符，去Map集合判断key是否存在：
            key存在：
                通过字符(key)，获取value(字符个数)
                value++
                put(key,value)把新的value存储到Map集合中
            key不存在：
                put(key,1)
        5、遍历Map集合，输出结果

 */
public class Demo04MapTest {
    public static void main(String[] args) {
        //1、使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        //2、创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();
        //3、遍历字符串，获取每一个字符
        for (char c : str.toCharArray()) {
            //4、使用获取到的字符，去Map集合判断key是否存在
            if (map.containsKey(c)){
                //key存在
                //通过字符(key)，获取value(字符个数)
                Integer value = map.get(c);
                //value++
                value++;
                map.put(c,value);
            }else {
                //key不存在
                map.put(c,1);
            }
        }

        //5、遍历Map集合，输出结果
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }


    }
}
