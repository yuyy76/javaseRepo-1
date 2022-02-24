package cn.yyy.day14.demo05;

import java.io.FileWriter;
import java.io.IOException;

/*
 在JDK1.7之间使用try catch finally处理缓冲中的异常
 格式：
    try{
        可能会产生异常的代码
    }catch(异常类的变量 变量名){
        异常的处理逻辑
    }finally{
        一定会执行的代码
        资源释放
    }
 */
public class Demo05TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        //fw = new FileWriter("D:\\stream\\data\\g.txt",true); 如果执行失败，
        // fw就没有值了，那么fw.close();语句就会报错
        FileWriter fw = null;
        try {
            fw = new FileWriter("w:\\stream\\data\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("东方不败"+i+"\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            //一定会执行的代码
            //创建对象失败了，fw的默认值就是null，null是不能调用方法的，会抛出NullPointerException，
            //  需要增加一个判断，不是null，再把资源释放了
            if (fw!=null) {
                try {
                    //fw.close方法声明抛出了IOException异常对象，所以我们就得处理这个异常对象
                    // 要么throws，要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
