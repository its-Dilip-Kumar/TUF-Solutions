class Solution {
    public int secondMostFrequentElement(int[] nums) {
     int n=nums.length;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
     }

     int firstFreq=-1;
     for(int x:map.values()){
        if(x>firstFreq){
            firstFreq=x;
        }
     }

     int secondFreq=-1;
     for(int f:map.values()){
        if(f<firstFreq && f>secondFreq){
            secondFreq=f;
        }
     }

     if(secondFreq==-1) return -1;

     int ans=Integer.MAX_VALUE;
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==secondFreq){
            ans=Math.min(ans,entry.getKey());
        }
     }
     return ans;
    }
}

