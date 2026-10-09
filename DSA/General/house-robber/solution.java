class Solution {
    public static int solve(int idx,int[] money,int[] dp){
        if(idx==0) return money[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take=money[idx]+solve(idx-2,money,dp);
        int notake=solve(idx-1,money,dp);
        return dp[idx]=Math.max(take,notake);
    }
    public int houseRobber(int[] money) {
        int n=money.length;
        if (n == 1) return money[0]; 
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        for(int i=0;i<n-1;i++){
            temp1[i]=money[i];
        }
        for(int i=1;i<n;i++){
            temp2[i-1]=money[i];
        }

        int[] dp1=new int[n-1];
        int[] dp2=new int[n-1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int first=solve(n-2,temp1,dp1);
        int second=solve(n-2,temp2,dp2);
        return Math.max(first,second);
    }
}