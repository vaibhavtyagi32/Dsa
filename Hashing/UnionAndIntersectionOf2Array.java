package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionOf2Array {
    public static Integer[] union(int []arr1,int []arr2){
        HashSet<Integer> hs=new HashSet<>();
        for(int n1:arr1){
            hs.add(n1);
        }
        for(int n2:arr2){
            hs.add(n2);
        }
        Integer []res=hs.toArray(new Integer[0]);
        return res;
    }
    public static ArrayList<Integer> intersection(int []arr1, int []arr2){
        HashSet<Integer> hs=new HashSet<>();
        for(int n1:arr1){
            hs.add(n1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int n2:arr2){
            if(hs.contains(n2)){
                list.add(n2);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        int []arr2={3,4,5,6};
        System.out.println("union of the two array is : ");
        Integer[]res=union(arr1,arr2);
        System.out.println(Arrays.toString(res));
        ArrayList<Integer> res2=intersection(arr1,arr2);
        System.out.println("intersection of the two array is : ");
        for(int el:res2){
            System.out.println(el);
        }
    }
}
