package Class.FatherAndSon2;



/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-16
 * Time: 17:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Main {
    public static void main(String[] args) {
        Animal b=new Bird(); //向上转型
        b.eat();
        //! error: b.fly(); b虽指向子类对象，但此时丢失fly()方法
        dosleep(new Male());
        dosleep(new Female());
    }
    public static void dosleep(Human h) {
        h.sleep();
    }
}
