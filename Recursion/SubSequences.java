package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void subsequence(int arr[], int idx, int n, List<Integer> list,int sum,int s){
        if(n==idx){
            if(s==sum) {
                for (int i : list) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            return;
        }
        list.add(arr[idx]);
        s=s+arr[idx];
        subsequence(arr,idx+1,n,list,sum,s);
        list.remove(list.size()-1);
        s=s-arr[idx];
        subsequence(arr,idx+1,n,list,sum,s);

    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        subsequence(arr,0,n,list,3,0);
    }
}
