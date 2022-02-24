package cn.yyy.day11.demo06;

public class DemoMain {

    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄起个名字，并且设置年龄
        hero.setName("独孤求败");
        hero.setAge(20);
        //创建一个武器，并且配备给英雄
        Weapon weapon = new Weapon("玄铁重剑");
        hero.setWeapon(weapon);

        hero.attack();

    }

}
