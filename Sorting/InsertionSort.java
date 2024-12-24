package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={3,1,4,2,6,7};
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
