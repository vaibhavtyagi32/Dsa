package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr={6,7,7,3,4,1,2,6};
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]<largest){
                slargest=arr[i];
            }
        }
        System.out.println("second largest is "+slargest);

    }
}
