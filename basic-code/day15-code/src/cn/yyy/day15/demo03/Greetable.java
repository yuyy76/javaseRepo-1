package cn.yyy.day15.demo03;

/**
 * 定义见面的函数式接口
 */
@FunctionalInterface
public interface Greetable {
    //定义一个见面的方法
    public abstract void greet();
}
