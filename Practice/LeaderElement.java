package Practice;

import java.util.ArrayList;
import java.util.List;

public class LeaderElement {
    public static void optimal(int []arr){
        int max=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
            }
            max=Math.max(arr[i],max);
        }
        System.out.println(list);
    }
    public static void brute(int []arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        System.out.println(list.stream().max((a,b)-> a-b).get());
    }
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        optimal(arr);
    }
}
