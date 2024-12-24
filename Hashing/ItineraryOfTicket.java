package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ItineraryOfTicket {
    public static String getStarted(HashMap<String,String> map){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:map.keySet()){
            revMap.put(map.get(key),key);
        }
        for(String key: map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");
        String start=getStarted(map);
        System.out.print(start);
        for(String key:map.keySet()){
            System.out.print("=>"+map.get(start));
            start=map.get(start);
        }
    }
}
