package cn.yyy.day15.demo03;

/**
 *
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
    public abstract int calcAbs(int number);
}
