package Exception.demo02.MyException;

import java.util.Scanner;

/*
要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

    分析:
        1.使用数组保存已经注册过的用户名(数据库)
        2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        3.定义一个方法,对用户输入的中注册的用户名进行判断
            遍历存储已经注册过用户名的数组,获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true:
                    用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
                false:
                    继续遍历比较
            如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";

 */
public class Demo01RegisterException {
    static String[] usrnms={"张三","李四","王五"};
    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入注册的用户名");
        String usrnm=sc.next();
        checkUsrnm(usrnm);
    }
    public static void checkUsrnm(String usrnm) /*throws RegisterException*/ {
        for (String name : usrnms) {
            if (name.equals(usrnm)){
                try {
                    throw new RegisterException("已注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法
                }
            }
        }
        System.out.println("注册成功");
    }
}
