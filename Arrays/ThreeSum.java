package Arrays;

import java.util.*;

public class ThreeSum {
    public static Set<List<Integer>> threeSum(int []arr){
        Arrays.sort(arr);
        Set<List<Integer>> total=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                List<Integer> list=new ArrayList<>();
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        total.add(list);
                    }
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};
        Set<List<Integer>> ans=threeSum(arr);
            System.out.println(Arrays.toString(ans.toArray()));
    }
}
