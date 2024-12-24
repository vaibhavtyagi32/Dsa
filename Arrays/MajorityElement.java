package Arrays;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static int check(int []arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>(arr.length/2)){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int better(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> keySet=map.keySet();
        for(int key:keySet){
            if(map.get(key)>arr.length/2){
                return key;
            }
        }
        return -1;
    }
    public static int optimal(int arr[]){
        int n=arr.length;
        int el=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(count==0){
                el=arr[i];
                count=1;
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(el==arr[i]){
                cnt++;
            }
        }
        if(cnt>n/2){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,3,2,3,2};
        int res=optimal(arr);
        System.out.println(res);
    }
}
