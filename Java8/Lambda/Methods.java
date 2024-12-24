package Java8.Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        List<Integer> list=List.of(6,2,3,4,5,1);
       List<Integer> newList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2=list.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newList2);

        list.stream().sorted().forEach(e->{
            System.out.print(e*e+" , ");
        });

    }
}
