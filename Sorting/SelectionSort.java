package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={1,4,3,6,7,2};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
