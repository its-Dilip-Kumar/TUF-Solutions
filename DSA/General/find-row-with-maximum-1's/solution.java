class Solution {
    public static int lowerbound(int[] nums,int n,int x){
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public int rowWithMax1s(int[][] mat) {
       int n=mat.length;
       int m=mat[0].length;
       
       int max_count=0;
       int index=-1;
       for(int i=0;i<n;i++){
        int cnt_ones=m-lowerbound(mat[i],m,1);
        if(cnt_ones>max_count){
            max_count=cnt_ones;
            index=i;
        }
       }
       return index;
    }
}