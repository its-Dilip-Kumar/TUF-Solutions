class Solution {    
    public int[] singleNumber(int[] nums) {        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        int[] ans=new int[2];
        int i=0;
        for(int x:map.keySet()){
            if(map.get(x)==1){
                ans[i++]=x;
            }
        }
        return ans;
    }
}