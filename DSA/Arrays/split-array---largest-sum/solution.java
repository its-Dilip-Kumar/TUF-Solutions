class Solution {
    public static boolean isPossible(int[] num,int mid,int k){
        int count=1;
        int sum=0;
        for(int i=0;i<num.length;i++){
            if(sum+num[i]>mid){
                count++;
                sum=num[i];
            }else{
                sum+=num[i];
            }
        }
        return count<=k;
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int start=0;
        int end=0;
        for(int num:a){
            start=Math.max(start,num);
            end+=num;
        }

        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(a,mid,k)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
