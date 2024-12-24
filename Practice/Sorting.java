package Practice;

import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i< arr.length;i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void countingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int j=0;j<count.length;j++){
            while(count[j]>0){
                arr[k]=j;
                k++;
                count[j]--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,1,2,5,3};
//        bubbleSort(arr);
//        print(arr);
//        selectionSort(arr);
//        print(arr);
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        countingSort(arr);
//        System.out.println(Arrays.toString(arr));


    }
}
