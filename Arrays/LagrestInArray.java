package Arrays;

public class LagrestInArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,7,5,4};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("largest is "+largest);
    }
}
