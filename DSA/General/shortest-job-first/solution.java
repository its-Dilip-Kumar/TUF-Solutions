class Solution {
    public long solve(int[] bt) {
        int n=bt.length;
        Arrays.sort(bt);
        long totalWaiting=0;
        long currentTime=0;
        for(int i=0;i<n;i++){
            totalWaiting+=currentTime;
            currentTime+=bt[i];
        }
        return totalWaiting/n;
    }
}