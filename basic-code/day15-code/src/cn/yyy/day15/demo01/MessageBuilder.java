package cn.yyy.day15.demo01;
/*

 */
@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接消息的抽象方法，返回被拼接的信息
    public abstract String buildMessage();
}
