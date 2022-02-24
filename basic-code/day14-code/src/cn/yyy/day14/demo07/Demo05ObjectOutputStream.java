package cn.yyy.day14.demo07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 java.io.ObjectOutputStream extends OutputStream
 ObjectOutputStream：对象的序列化流
 作用：把对象以流的方式写入到文件中保存

 构造方法：
    ObjectOutputStream(OutputStream out)：创建写入指定OutputStream的ObjectOutputStream。
    参数：
        ObjectOutputStream：字节输出流
    特有的成员方法：
        void writeObject(Object obj)：将指定的对象写入ObjectOutputStream

    使用步骤：
        1、创建ObjectOutputStream对象，构造方法中传递字节输出流
        2、使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        3、释放资源
 */
public class Demo05ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1、创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\stream\\person.txt"));
        //2、使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        oos.writeObject(new Person("张无忌",20));  //二进制写进去的 无法直接读
        //3、释放资源
        oos.close();
    }
}
