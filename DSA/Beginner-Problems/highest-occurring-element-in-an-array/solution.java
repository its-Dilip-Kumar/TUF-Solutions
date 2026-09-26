class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        int maxfreq=0;
        int result=-1;
        for(int key:map.keySet()){
            int element=key;
            int count=map.get(key);

            if(count>maxfreq){
                maxfreq=count;
                result=element;
            }else if(count==maxfreq && element<result){
                result=element;
            }
        }
        return result;
    }
}


