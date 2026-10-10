class Info{
    int key;
    int val;
    public Info(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }

        PriorityQueue<Info> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int x:map.keySet()){
            pq.add(new Info(x,map.get(x)));
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] ans=new int[k];
        int idx=0;
        while(!pq.isEmpty()){
            ans[idx++]=pq.poll().key;
        }
        return ans;
    }
}