package Practice.Pattern;

import java.util.Arrays;

public class ThreeSum {
    public static boolean sum3(int []arr,int key){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int f=i+1;
            int l=arr.length-1;
            while(f<l){
                if(arr[f]+arr[l]+arr[i]==key){
                    return true;
                }
                if(arr[f]+arr[l]+arr[i]<key){
                    f++;
                }
                if(arr[f]+arr[l]+arr[i]>key){
                    l--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,6,7,5,9,8};
        System.out.println(sum3(arr,100));
    }
}
