package Practice;

public class Seaching {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,4,2,1,3,8,9};
        int key=5;
        int res=linearSearch(arr,key);
        System.out.println("linear search "+res);
        int res2=binarySearch(arr,key);
        System.out.println("binary search "+res);

    }
}
