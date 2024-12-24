package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
                k++;
            }
            else{
                temp[k]=arr[right];
                right++;
                k++;
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=arr[right++];
        }
        for(int i=0,j=low;i<temp.length;i++,low++){
            arr[low]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,1,5,2,6,4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
