package Arrays;

public class ContainerWithMostWater {
    public static int brute(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                int vol=height*width;
                max=Math.max(max,vol);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int ans=brute(arr);
        System.out.println(ans);
    }
}
