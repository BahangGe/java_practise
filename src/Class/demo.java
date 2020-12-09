package Class;

import javax.sound.midi.Soundbank;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-9
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class demo {
    public static void main(String[] args) {
        Person min=new Person();
        Person hong=new Person("xiaohong",123);
        System.out.println(hong.getAge());
        System.out.println(hong.toString());
        min.setName("xiaomin");
        System.out.println(min.name);
    }
}