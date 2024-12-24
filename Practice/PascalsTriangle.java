package Practice;

public class PascalsTriangle {
    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" "+fact(i)/(fact(i-k)*fact(k)));
            }
            System.out.println();
        }
    }
    public static int fact(int n){
        int num=1;
        if(n==0||n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            num=num*i;
        }
        return num;
    }
    public static void main(String[] args) {
        print(5);
    }
}
