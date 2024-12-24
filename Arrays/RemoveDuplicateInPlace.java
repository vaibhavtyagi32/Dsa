package Arrays;

public class RemoveDuplicateInPlace {
    static int removeDuplicate(int []arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,3,3,3,4,4,5};
        int size=removeDuplicate(arr);
        System.out.println(size);
    }
}
