package Hashing;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //Insert O(1)

        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);

        System.out.println(hm);

        //get O(1)
        int population=hm.get("india");
        System.out.println(population);
//        int population2=hm.get("dubai");
//        System.out.println(population2);

        // containsKey  O(1)
        System.out.println(hm.containsKey("india"));  //true
        System.out.println(hm.containsKey("dubai"));  // false

        //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm.remove("dubai"));

        // size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear -> to clear all the data of hashmap
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
