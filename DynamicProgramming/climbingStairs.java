package DynamicProgramming;

import java.util.Arrays;

public class climbingStairs {
    public static int countways(int n,int []dp){

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=countways(n-1,dp)+countways(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countways(n,dp));
    }
}
