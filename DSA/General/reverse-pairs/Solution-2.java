class Solution {
    public static long countPairs(int[] arr,int start,int mid,int end){
        int right=mid+1;
        long count=0;
        for(int i=start;i<=mid;i++){
            while(right<=end && arr[i]>2L*arr[right]) right++;
            count+=(right-(mid+1));
        }
        return count;
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=0;
        int[] temp=new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(int x=0;x<temp.length;x++){
            arr[start+x]=temp[x];
        }
    }
    public static int mergesort(int[] arr,int start,int end){
        int count=0;
        if(start>=end){
            return count;
        }
        int mid=start+(end-start)/2;
        count+=mergesort(arr,start,mid);
        count+=mergesort(arr,mid+1,end);
        count+=countPairs(arr,start,mid,end);
        merge(arr,start,mid,end);
        return count;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergesort(nums,0,n-1);
    }
}