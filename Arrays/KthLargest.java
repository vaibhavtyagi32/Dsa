package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static int largest(int []arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,80,60,70};
        int k=3;
        int max=largest(arr,k);
        System.out.println(max);
    }
}
