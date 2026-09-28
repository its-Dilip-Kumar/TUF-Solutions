class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int left=0;
        int right=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<n && right<m){
            if(nums1[left]<nums2[right]){
                left++;
            }else if(nums1[left]>nums2[right]){
                right++;
            }else{
                ans.add(nums1[left]);
                left++;
                right++;
            }
        }

        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}