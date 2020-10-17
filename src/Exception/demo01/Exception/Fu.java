package Exception.demo01.Exception;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
}
class Zi extends Fu{
    public void show01() throws NullPointerException,ClassCastException{}//相同
    public void show02() throws ArrayIndexOutOfBoundsException{}//子类异常
    public void show03() {}//不抛出
    public void show04(){
        try {
            throw new Exception("qay");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}