class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
    int n=arr.length;
    int[] res=new int[n-k+1];
    if(n==0) return res;
    Deque<Integer> dq=new ArrayDeque<>();
    int idx=0;
    while(idx<k){
        while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[idx]){
            dq.pollLast();
        }
        dq.offerLast(idx);
        idx++;
    }

    res[0]=arr[dq.peekFirst()];
    for(int i=k;i<n;i++){
        if(!dq.isEmpty() && dq.peekFirst()<=(i-k)){
            dq.pollFirst();
        }

        while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
            dq.pollLast();
        }

        dq.offerLast(i);
        res[i-k+1]=arr[dq.peekFirst()];
    }
    return res;

    }
}
