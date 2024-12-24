package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int []arr,int si,int ei){
        if(si>=ei)
        {
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int []arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int k=si;k<ei;k++){
            if(arr[k]<=pivot){
                i++;
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=arr[k];
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;
        return i;
    }
    public static void main(String[] args) {
        int []arr={3,2,6,5,9,1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
