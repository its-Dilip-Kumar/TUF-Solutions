class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            while(i+1<n && nums1[i+1]==nums1[i]) i++;
            while(j+1<m && nums2[j+1]==nums2[j]) j++;

            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else if(nums1[i]>nums2[j]){
                arr.add(nums2[j]);
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
                    while(i<n){
                if(arr.isEmpty() || arr.get(arr.size()-1)!=nums1[i]){
                    arr.add(nums1[i]);
                }
                i++;
            }
            while(j<m){
                if(arr.isEmpty() || arr.get(arr.size()-1)!=nums2[j]){
                    arr.add(nums2[j]);
                }
                j++;
            }

        int[] ans=new int[arr.size()];
        for(int x=0;x<arr.size();x++){
            ans[x]=arr.get(x);
        }
        return ans;
    }
}