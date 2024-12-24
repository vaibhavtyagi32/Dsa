package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {
    public static int[] rearrange(int []arr){
        int []newArr=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newArr[pos]=arr[i];
                pos=pos+2;
            }else{
                newArr[neg]=arr[i];
                neg=neg+2;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int []arr={3,1,-2,-5,2,-4};
        int[]res=rearrange(arr);
        System.out.println(Arrays.toString(res));
    }
}
