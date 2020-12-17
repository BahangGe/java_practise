package Class.FatherAndSon2;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-16
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Human {
    public void sleep() {
        System.out.println("Human sleep..");
    }
}
class Male extends Human {
    @Override
    public void sleep() {
        System.out.println("Male sleep..");
    }
}
class Female extends Human {
    @Override
    public void sleep() {
        System.out.println("Female sleep..");
    }
}