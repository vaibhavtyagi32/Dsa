package Practice;

public class SwapMaxMin2DArray {
    public static void print(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void swap(int [][]arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>=max){
                    max=arr[i][j];
                    a=i;
                    b=j;
                }if(arr[i][j]<=min){
                    min=arr[i][j];
                    c=i;
                    d=j;
                }
            }
        }
        int temp=arr[a][b];
        arr[a][b]=arr[c][d];
        arr[c][d]=temp;
    }
    public static void main(String[] args) {
        int [][]arr={{1,3,4},{5,6,7},{9,4,3}};
        print(arr);
        swap(arr);
        System.out.println("======================================================");
        print(arr);
    }
}
