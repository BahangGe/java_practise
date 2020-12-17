package Class.FatherAndSon2;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-16
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Animal {
    public void eat(){
        System.out.println("animal eatting...");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("bird eatting...");
    }
    public void fly(){
        System.out.println("bird flying...");
    }
}
