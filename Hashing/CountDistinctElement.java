package Hashing;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,7,5,9,4,9};
        HashSet<Integer> hs=new HashSet<>();
        for(int n:arr){
            hs.add(n);
        }
        System.out.println("number of distinct element : "+hs.size());
    }
}
