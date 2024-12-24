package Arrays;

public class IsSortedArray {
    static boolean isSorted(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]>arr[i+1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,4,5,6};
        System.out.println(isSorted(arr));
    }
}
