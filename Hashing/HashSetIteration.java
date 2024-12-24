package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);
        // using iterator
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=========================================");
        // using enhanced for loop
        for(int s:hs){
            System.out.println(s);
        }
    }
}
