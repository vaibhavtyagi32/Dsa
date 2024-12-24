package Arrays;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    static void rotate(int []arr){
        int f=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=f;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
