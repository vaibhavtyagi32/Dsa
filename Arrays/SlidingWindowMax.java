package Arrays;

import java.util.Arrays;

// maximum of all subarray of size k
public class SlidingWindowMax {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int k=2;
        int []newarr=new int[arr.length-k+1];
        for(int i=0;i<arr.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            newarr[i]=max;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
