package Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class WeakestRow {
        static class weak implements Comparable<weak>{
            int idx;
            int count;
            weak(int count,int idx){
                this.count=count;
                this.idx=idx;
            }
            public int compareTo(weak s2){
                if(this.count==s2.count){
                    return this.idx-s2.idx;
                }
                else{
                    return this.count-s2.count;
                }
            }

        }
        public static int[] kWeakestRows(int[][] mat, int k) {
            PriorityQueue<weak> pq=new PriorityQueue<>();
            for(int i=0;i<mat.length;i++){
                int count=0;
                for(int j=0;j<mat[0].length;j++){
                    count += mat[i][j]==1? 1 : 0;
                }
                pq.add(new weak(count,i));
            }
            int arr[]=new int[k];
            for(int i=0;i<k;i++){
                arr[i]=pq.remove().idx;
            }
            return arr;
        }

    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        System.out.println(Arrays.toString(kWeakestRows(arr,k)));
    }
    }

