package Arrays;

import java.util.Arrays;

public class RotateKToLeft {
    public static void reverse(int []arr,int si,int ei){
        while(si<=ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void rotate(int []arr,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
