package cn.yyy.day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：请使用日期时间相关的API，计算出一个人已经出生了多少天。
 * 分析：
 *  1、使用Scanner类中的方法，获取出生日期；
 *  2、使用DateFormat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期；
 *  3、把Date格式的出生日期转换为毫秒值；
 *  4、获取当前日期，转换为毫秒值；
 *  5、使用当前日期的毫秒值-出生日期的毫秒值
 *  6、把毫秒差值转换为天(ms/1000/60/60/24)
 */
public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类中的方法，获取出生日期；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-mm-dd：");
        String birthdayDateString = sc.next();
        //System.out.println("111" + birthdayDateString);

        //2、把字符串的出生日期，解析为Date格式的出生日期
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-mm-dd");
        Date birthdayDate = simp.parse(birthdayDateString);
        //System.out.println("222" + birthdayDate);

        //3、把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        //4、获取当前日期，转换为毫秒值
        long todayTime = new Date().getTime();

        //5、使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;

        //6、把毫秒差值转换为天(ms/1000/60/60/24)
        long s = time/1000/60/60/24;

        System.out.println("你已经活了"+s+"天！");



    }


}
