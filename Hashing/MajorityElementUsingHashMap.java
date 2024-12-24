package Hashing;

import java.util.*;

public class MajorityElementUsingHashMap {
    public static int majority(int []arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        Set<Integer> keySet=hm.keySet();
        for(int key:keySet){
            if(hm.get(key)>arr.length/2){
                return key;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,2,4,2,2};
        int res=majority(arr);
        System.out.println(res);
    }
}
