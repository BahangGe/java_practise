package IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();

    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("prop.txt"));
        Set<String> keyset = prop.stringPropertyNames();
        /*for (String k : key) {
            System.out.println(k+"="+prop.getProperty( k));
        }*/
        for (String key : keyset) {
            System.out.println(key+'='+prop.getProperty(key));
        }


    }
}
