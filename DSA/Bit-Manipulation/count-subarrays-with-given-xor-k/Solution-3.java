class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int n=nums.length;
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      int xor=0;
      int count=0;
      for(int i=0;i<n;i++){
        xor^=nums[i];
        int target=xor^k;
        if(map.containsKey(target)){
            count+=map.get(target);
        }
        if(map.containsKey(xor)){
            map.put(xor,map.get(xor)+1);
        }else{
            map.put(xor,1);
        }
      }
      return count;
    }
}