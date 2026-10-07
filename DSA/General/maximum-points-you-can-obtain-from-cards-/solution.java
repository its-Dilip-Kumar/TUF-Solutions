class Solution {
    public int maxScore(int[] cardScore, int k) {
        int n=cardScore.length;
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardScore[i];
        }

        maxsum=leftsum;
        int rightIdx=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardScore[i];
            rightsum+=cardScore[rightIdx];
            rightIdx--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}