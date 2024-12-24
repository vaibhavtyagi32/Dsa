package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElement {
    public static void brute(int []arr){
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        for(int j=0;j<pos.size();j++){
            arr[j*2]=pos.get(j);
            arr[j*2+1]=neg.get(j);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void optimal(int []arr){
        int pos=0,neg=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg=neg+2;
            }else{
                ans[pos]=arr[i];
                pos=pos+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        optimal(arr);
    }
}
