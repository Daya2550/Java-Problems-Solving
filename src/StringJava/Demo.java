package StringJava;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A();
        a.value = 10;

        A b = (A) a.clone();

        System.out.println(b.value);
    }
}

class A  implements Cloneable {

    int value;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
