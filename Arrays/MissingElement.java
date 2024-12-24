package Arrays;

public class MissingElement {
    public static int missing(int []arr){
        int l=arr.length;
        int esum=(l*(l+1))/2;
        int sum=0;
        for(int el:arr){
            sum += el;
        }
        return esum-sum;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,4};
        int res=missing(arr);
        System.out.println(res);
    }
}
