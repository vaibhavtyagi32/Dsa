package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static Integer[] remove(int []arr){
        Set<Integer> s=new HashSet<>();
        for(int ele:arr){
            s.add(ele);
        }
        Integer[] newArr=s.toArray(new Integer[0]);
        return newArr;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,3,4,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        Integer[]res=remove(arr);
        for(Integer num:res){
            System.out.println(num);
        }

    }
}
