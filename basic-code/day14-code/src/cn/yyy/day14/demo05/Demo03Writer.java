package cn.yyy.day14.demo05;

import java.io.FileWriter;
import java.io.IOException;

/*
 字符输出流写数据的其他方法
    void write(char[] cbuf)：写入字符数组
    abstract  void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数
    void write(String str)：写入字符串
    void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\stream\\data\\f.txt");

        //void write(char[] cbuf)：写入字符数组
        char[] chars = {'a','b','c','d','e'};
        fw.write(chars);
        fw.flush();

        //abstract  void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数
        fw.write(chars,2,2);
        fw.flush();

        //void write(String str)：写入字符串
        fw.write("叶文洁");
        fw.flush();

        //void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数
        fw.write("123认为宇宙间有其他的生命体，大家遵从黑暗森林法则",3,23);
        fw.close();

    }
}
