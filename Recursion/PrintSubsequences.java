package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void print(int []arr,int idx,int n,List<Integer> list){
        if(idx==n){
            for(int it:list){
                System.out.print(it+" ");
            }
            System.out.println();
            return;
        }
        list.add(arr[idx]);
        print(arr,idx+1,n,list);
        list.remove(list.size() - 1);
        print(arr,idx+1,n,list);
    }
    public static void main(String[] args) {
        int []arr={3,2,1};
        List<Integer> list=new ArrayList<>();
        print(arr,0,arr.length,list);
    }
}
