package Recursion;

public class LinearSearch {
    public static int search(int []arr,int key,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return search(arr,key,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,3,8,9};
        int key=87;
        int res=search(arr,key,0);
        System.out.println(res);
    }
}
