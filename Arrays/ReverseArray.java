package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int []arr){
        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
