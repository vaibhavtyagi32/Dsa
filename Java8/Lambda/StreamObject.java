package Java8.Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        String names[]={"vaibhav","aryan","nikhil","himanshu"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
        System.out.println("=============================================================");
        Stream<Object> stream2=Stream.builder().build();
        System.out.println("=============================================================");
        IntStream stream3=Arrays.stream(new int[]{1,2,3,4,5,6});
        stream3.forEach(e->{
            System.out.println(e);
        });
    }
}
