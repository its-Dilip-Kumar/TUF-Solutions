class KthLargest {
    int K;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        K=k;
        pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>K){
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if(pq.size()>K){
            pq.poll();
        }
        return pq.peek();
    }
}