class Solution {
    public int[] pascalTriangleII(int r) {
        r=r-1;
        int[] ans=new int[r+1];
        int res=1;
        ans[0]=1;
        for(int i=0;i<r;i++){
            res=res*(r-i);
            res=res/(i+1);
            ans[i+1]=(int)res;
        }
        return ans;
    }
}