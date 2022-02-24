package cn.yyy.day14.demo07;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 java.io.PrintStream：打印流
    PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
 PrintStream特点：
    1、只负责数据的输出，不负责数据的读取
    2、与其他输出流不同，PrintStream 永远不会抛出 IOException
    3、有特有的方法，print,println
        void print(任意类型的值)
        void println(任意类型的值并换行)
 构造方法：
    PrintStream(File file)：输出的目的地是一个文件
    PrintStream(OutputStream out)：输出的目的地是一个字节输出流
    PrintStream(String fileName)：输出的目的地是一个文件路径

 PrintStream extends OutputStream
 继承自父类的成员方法：
     public void close()：关闭此输出流并释放与此流有关的所有系统资源。
     public void flush()：刷新此输出流并强制写出所有缓冲的输出字节。
     public void write(byte[] b)：将b.length个字节从指定的byte数组写入此输出流。
     public void write(byte[] b, int off, int len)：将指定byte数组中从偏移量off开始的len个字节写入此输出流。
     public abstract void write(int b)：将指定的字节写入此输出流。
 注意事项：
    如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表 97->a
    如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97

 */
public class Demo08PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Hello World");
        //1、创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("D:\\stream\\print.txt");
        //如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表 97->a
        ps.write(97);
        //如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
        ps.println(97);
        ps.println(true);
        ps.println(3.14);
        ps.println("路飞");
        ps.println(new Person("娜美",18));
        //释放资源
        ps.close();

    }
}
