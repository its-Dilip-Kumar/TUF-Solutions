class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int minFreq=Integer.MAX_VALUE;
        int maxFreq=Integer.MIN_VALUE;
        for(int key:map.keySet()){
            int element=key;
            int count=map.get(key);
            minFreq=Math.min(minFreq,count);
            maxFreq=Math.max(maxFreq,count);
        }
        return minFreq+maxFreq;
    }
}
