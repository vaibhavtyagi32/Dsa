package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static boolean check(int []arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean check2(int []arr,int k){
        Arrays.sort(arr);
        int f=0;
        int l=arr.length-1;
        while(f<l){
            if(arr[f]+arr[l]==k){
                return true;
            }
            else if(arr[f]+arr[l]>k){
                l--;
            }
            else{
                f++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,6,5,8,11};
        int k=20;
        boolean b=check2(arr,k);
        System.out.println(b);
    }

}
