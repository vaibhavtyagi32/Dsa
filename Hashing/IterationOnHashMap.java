package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);
        hm.put("Dubai",400);
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for(String k:keys){
            System.out.println("key ="+k+" , "+"value ="+hm.get(k));
        }
    }
}
