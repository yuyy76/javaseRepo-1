package cn.yyy.day14.demo07;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 可以改变输出语句的目的地(打印流的流向)
 输出语句，默认在控制台输出
 使用：System.setOut方法，改变输出语句的目的地改为参数中传递的打印流的目的地
    static void setOut(PrintStream out)：重新分配“标准”输出流
 */
public class Demo09PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");

        PrintStream ps = new PrintStream("D:\\stream\\目的地是打印流.txt");
        //把输出语句的目的地改变为打印流的目的地
        System.setOut(ps);
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
