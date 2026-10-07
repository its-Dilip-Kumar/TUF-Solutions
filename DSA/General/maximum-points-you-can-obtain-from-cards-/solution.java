class Solution {
    public int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardScore[i];
        }

        int maxSum = sum;
        for (int i = 1; i <= k; i++) {
            sum += cardScore[n - i] - cardScore[k - i];   // ✅ One-liner
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}