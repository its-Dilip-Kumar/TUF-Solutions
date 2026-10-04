class Solution {
    public static int findFirst(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static int findLast(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public int countOccurrences(int[] arr, int target) {
        int first=findFirst(arr,target);
        if(first==-1) return 0;
        int last=findLast(arr,target);
        return last-first;
    }
}
