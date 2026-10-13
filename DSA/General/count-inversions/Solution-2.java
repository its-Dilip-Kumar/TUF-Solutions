class Solution {
    public static long merge(int[] nums,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=0;
        long count=0;
        int[] temp=new int[end-start+1];

        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
                count+=(mid-i+1);
            }
        }

        while(i<=mid){
            temp[k++]=nums[i++];
        }

        while(j<=end){
            temp[k++]=nums[j++];
        }

        for(int x=0;x<temp.length;x++){
            nums[start+x]=temp[x];
        }
        return count;

    }
    public static long mergesort(int start,int end,int[] nums){
        long count=0;
        if(start>=end) return count;
        int mid=start+(end-start)/2;
        count+=mergesort(start,mid,nums);
        count+=mergesort(mid+1,end,nums);
        count+=merge(nums,start,mid,end);
        return count;
    }
    public long numberOfInversions(int[] nums) {
        int n=nums.length;
        return mergesort(0,n-1,nums);
    }
}