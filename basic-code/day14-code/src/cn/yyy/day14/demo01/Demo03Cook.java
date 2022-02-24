package cn.yyy.day14.demo01;
/*
 需求：给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
    使用Lambda的标准格式调用invokeCook方法，打印输出"吃饭啦！"字样


 */
public class Demo03Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！");
            }
        });

        //Lambda的标准格式调用
        invokeCook(()->{
            System.out.println("吃饭啦！");
        });

        //优化省略Lambda调用
        invokeCook(()->System.out.println("吃饭啦！"));



    }
    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
