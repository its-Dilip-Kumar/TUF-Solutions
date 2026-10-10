class Solution {
    public static int solve(int i,int j,String str1,String str2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]=1+solve(i-1,j-1,str1,str2,dp);
        }
        return dp[i][j]=0;
    }
    public int longestCommonSubstr(String str1, String str2) {
     int n=str1.length();
     int m=str2.length();
     int[][] dp=new int[n][m];
     for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
     }

     int maxlen=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            maxlen=Math.max(maxlen,solve(i,j,str1,str2,dp));
        }
     }
     return maxlen;
    }
}