class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int n=arr.size();
      int start=0;
      int end=n-1;
      int ans=Integer.MAX_VALUE;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr.get(start)<=arr.get(mid)){
            ans=Math.min(ans,arr.get(start));
            start=mid+1;
        }else{
            ans=Math.min(ans,arr.get(mid));
            end=mid-1;
        }
      }
      return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
