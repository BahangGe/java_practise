package Class;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 2020-12-9
 * Time: 17:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        System.out.printf("You haven't set age!(%s,%s)",this.getClass(),this.hashCode());
        System.out.println();
    }

    public Person(int age) {
           this.age=age;
        System.out.printf("You haven't set name!(%s,%s)",this.getClass(),this.hashCode());
        System.out.println();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public void setNameAndAge(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public void setNameAndAge(int age,String name) {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}