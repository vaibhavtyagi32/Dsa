package Practice;
import java.util.Arrays;
public class ThreeSum {
    public static void threeSum(int []arr,int t){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<=k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>t){
                    k--;
                }
                else if(sum<t){
                    j++;
                }
                else{
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]+" ");
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,8};
        int k=12;
        threeSum(arr,k);
    }
}
