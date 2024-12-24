package Arrays;

import java.util.Arrays;

public class RemoveDuplicate2 {
    public static int[] remove(int []arr){
        int []temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,6,7};
        System.out.println(Arrays.toString(arr));

        int res[]=remove(arr);
        System.out.println(Arrays.toString(res));
    }
}
