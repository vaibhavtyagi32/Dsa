package Arrays;


public class KadanesAlgo {
    public static int maxSum(int []arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,2,-3,-5,6,7,-1,2};
        int res=maxSum(arr);
        System.out.println(res);
    }
}
