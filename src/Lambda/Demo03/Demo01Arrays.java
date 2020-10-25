package Lambda.Demo03;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr={
                new Person("a",1),
                new Person("b",3),
                new Person("c",2)
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
