class Solution {
    public ArrayList<Integer> primesInRange(ArrayList<int[]> queries) {
        ArrayList<Integer> ans = new ArrayList<>();

        int maxval = 0;
        for (int[] query : queries) maxval = Math.max(maxval, query[1]);

        boolean[] prime = new boolean[maxval + 1];
        Arrays.fill(prime, true);
        if (maxval >= 0) prime[0] = false;
        if (maxval >= 1) prime[1] = false;

        for (int i = 2; i * i <= maxval; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= maxval; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Prefix array
        int[] prefix = new int[maxval + 1];
        for (int i = 1; i <= maxval; i++) {
            prefix[i] = prefix[i - 1] + (prime[i] ? 1 : 0);
        }

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int count = prefix[end];
            if (start > 0) count -= prefix[start - 1];
            ans.add(count);
        }
        return ans;
    }
}