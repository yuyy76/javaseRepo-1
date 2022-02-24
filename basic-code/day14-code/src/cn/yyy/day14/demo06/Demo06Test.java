package cn.yyy.day14.demo06;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.jar.JarOutputStream;

/*
 练习：
    对文本的内容进行排序
    按照每段文本前编号(1，2，3，...)顺序排序
 分析：
    1、创建一个HashMap集合对象，key：存储每行文本序号(1,2,3...)；value:存储每行文本
    2、创建字符缓冲输入流对象，构造方法中绑定字符输入流
    3、创建字符缓冲输出流对象，构造方法中绑定字符输出流
    4、使用字符缓冲输入流中的方法readLine,逐行读取文本
    5、对读取到的文本进行切割，获取行中的序号和文本内容
    6、把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的，会自动排序1,2,3...)
    7、遍历HashMap集合，获取每一个键值对
    8、把每一个键值对，拼接为一个文本行
    9、把拼接好的文本，使用字符缓冲输出流中的方法write,写入到文件中
    10、释放资源
 */
public class Demo06Test {
    public static void main(String[] args) throws IOException {
        //1、创建一个HashMap集合对象，key：存储每行文本序号(1,2,3...)；value:存储每行文本
        HashMap<String, String> map = new HashMap<>();
        //2、创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\stream\\in.txt"));
        //3、创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\stream\\out.txt"));
        //4、使用字符缓冲输入流中的方法readLine,逐行读取文本
        String line = null;
        while ((line=br.readLine())!=null){
            //5、对读取到的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            System.out.println(Arrays.toString(arr));
            //6、把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的，会自动排序1,2,3...)
            map.put(arr[0],arr[1]);
        }
        //7、遍历HashMap集合，获取每一个键值对
        for (String key : map.keySet()) {
            String value = map.get(key);
//            System.out.println(key+"::"+value);
            //8、把每一个键值对，拼接为一个文本行
            line = key + "." + value;
            //9、把拼接好的文本，使用字符缓冲输出流中的方法write,写入到文件中
            bw.write(line);
            bw.newLine();
        }
//        bw.flush();
        bw.close();
        br.close();
    }
}
