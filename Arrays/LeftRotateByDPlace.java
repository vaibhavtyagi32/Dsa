package Arrays;

import java.util.Arrays;

public class LeftRotateByDPlace {
    public static void reverse(int []nums,int si,int ei){
        while(si<=ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void rotate(int []arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
