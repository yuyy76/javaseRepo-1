package cn.yyy.day09.demo06;

public class NewPhone extends Phone{
    @Override
    public void show() {
        //System.out.println("显示号码");
        //把父类的show方法拿过来重复利用
        super.show();
        //自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
