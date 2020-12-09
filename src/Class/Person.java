package Class;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-9
 * Time: 17:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Person {
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}