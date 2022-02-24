package cn.yyy.day14.demo05;

import java.io.FileWriter;
import java.io.IOException;

/*
 续写和换行写
 续写，追加写：使用两个参数的方法
    FileWriter(String fileName, boolean append)
    FileWriter(File file, boolean append)
    参数：
        String fileName，File file：写入数据的目的地
        boolean append：续写开关 true：不会创建新的文件覆盖源文件，可以续写
            false：创建新的文件覆盖源文件
 换行：换行符号
    windows：\r\n
    linux：/r
    mac：/r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\stream\\data\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("令狐冲"+i+"任盈盈"+"\r\n");
        }
        fw.close();
    }
}
