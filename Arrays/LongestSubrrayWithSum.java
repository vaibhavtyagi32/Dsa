package Arrays;

public class LongestSubrrayWithSum {
    public static int count(int []arr,int k){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    cnt=Math.max(cnt,j-i+1);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int res=count(arr,3);
        System.out.println(res);
    }
}
