package DynamicProgramming;

public class Knapsack01 {
    public static int knapsack(int []val,int []wt,int W,int i){
        if(W==0||i==0){
            return 0;
        }
        if(wt[i-1]<=W){ //valid
            //include
           int ans1=val[i-1]+knapsack(val,wt,W-wt[i-1],i-1);
           //exclude
           int ans2=knapsack(val,wt,W,i-1);
           return Math.max(ans1,ans2);
        }
        else{//invalid
            return knapsack(val,wt,W,i-1);
        }
    }
    public static int knapsackMemoization(int []val,int []wt,int W,int i,int [][]dp){
        if(W==0||i==0){
            return 0;
        }
        if(dp[i][W]!=-1){
            return dp[i][W];
        }
        if(wt[i-1]<=W){ //valid
            //include
            int ans1=val[i-1]+knapsack(val,wt,W-wt[i-1],i-1);
            //exclude
            int ans2=knapsack(val,wt,W,i-1);
            dp[i][W]=Math.max(ans1,ans2);
            return dp[i][W];
        }
        else{//invalid
            dp[i][W]=knapsack(val,wt,W,i-1);
            return dp[i][W];
        }
    }
    public static void main(String[] args) {
        int []val={15,14,10,45,30};
        int []wt={2,5,1,3,4};
        int W=7;
        int [][]dp=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=knapsack(val,wt,W,val.length);
        System.out.println(ans);
        int ans2=knapsackMemoization(val,wt,W,val.length,dp);
        System.out.println(ans2);
    }
}
