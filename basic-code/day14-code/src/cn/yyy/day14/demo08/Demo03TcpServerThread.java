package cn.yyy.day14.demo08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
 创建BS版本TCP服务器

 分析：
 客户端是浏览器 -> Socket -> 访问服务器
 服务器读取客户端的请求信息
 服务器要给客户端回写一个信息，这个信息就是回写一个html页面（文件）
 我们需要读取index.html文件，就必须得知道这个文件得地址，而这个地址就是请求信息
 的第一行 GET /day14-code/web/index.html HTTP/1.1

 可以使用BufferedReader中的方法readLine读取一行
 InputStream is = Socket.getInputStream();
 new BufferedReader(new InputStreamReader(is)):把网络字节输入流转为字符缓冲输入流

 可以使用String类的方法split(" ")切割字符串，获取中间的部分
 arr[1] /day14-code/web/index.html

 使用String类的方法substring(1)，获取html文件的路径
 day14-code/web/index.html
 服务器创建一个本地的字节输入流，根据获取到的文件路径，读取html文件

    固定写法：
        //写入Http协议响应头，固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:text/html\r\n".getBytes());
        //必须要写入空行，否则浏览器不解析
        out.write("\r\n".getBytes());

 服务器端使用网络字节输出流把读取到的文件，写到客户端(浏览器)显示

 */
public class Demo03TcpServerThread {
    public static void main(String[] args) throws IOException {
        //1、创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);

        /**
         * 浏览器解析服务器回写的html页面，页面中如果有图片，那么浏览器就会单独的开启
         * 一个线程，读取服务器的图片；我们就得让服务器一直处于监听状态，客户端请求一
         * 次，服务器就回写一次
         */
        while (true){
            //2、使用accept方法获取到请求的客户端对象(浏览器)
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3、使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4、使用网络字节输入流InputStream对象中的方法read，读取客户端的请求信息
           /* byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=is.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }*/
                        //把is网络字节输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求的第一行读出来
                        String line = br.readLine();
                        System.out.println(line);
                        //把读取的信息进行切割，只要中间的部分
                        String[] arr = line.split(" ");
                        //把路径前边的/去掉，进行截取
                        String htmlPath = arr[1].substring(1);

                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream(htmlPath);
                        //使用Socket中的方法getOutputStream获取网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();

                        //固定写法
                        //写入Http协议响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须要写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写复制文件，把服务器读取的html文件回写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len=fis.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }
                        //释放资源
                        fis.close();
                        socket.close();

                    }catch (IOException e){
                        System.out.println(e);
                    }

                }
            }).start();






        }



//        server.close();
    }
}
