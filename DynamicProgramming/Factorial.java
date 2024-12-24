package DynamicProgramming;

public class Factorial {
    public static int fact(int n,int[]dp){
        if(n==1||n==0){
            return 1;
        }
        if(dp[n]==0){
            dp[n]=n*fact(n-1,dp);
            return dp[n];
        }else{
            return dp[n];
        }
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(fact(n,dp));
    }
}
