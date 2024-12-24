package Recursion;

public class ArraySortedOrNot {
    public static boolean isSorted(int []arr,int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int []arr={1,3,4,9,2};
        boolean res=isSorted(arr,0);
        System.out.println(res);
    }
}
