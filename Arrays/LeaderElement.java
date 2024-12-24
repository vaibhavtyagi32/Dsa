package Arrays;

import java.util.ArrayList;

public class LeaderElement {
    // brute force O(n2) time complexity
    public static ArrayList<Integer> leader1(int []arr){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    // optimal approch
    public static ArrayList<Integer> leader(int []arr){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> list=leader1(arr);
        for(int el:list){
            System.out.println(el);
        }
        ArrayList<Integer> list2=leader(arr);
        for(int el:list2){
            System.out.println(el);
        }
    }
}
