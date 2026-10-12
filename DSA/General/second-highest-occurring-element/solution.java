class Solution {
    public int secondMostFrequentElement(int[] nums) {
        // Step 1: Frequency count
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Highest frequency
        int firstFreq = -1;
        for (int f : map.values()) {
            firstFreq = Math.max(firstFreq, f);
        }

        // Step 3: Second highest frequency (distinct)
        int secondFreq = -1;
        for (int f : map.values()) {
            if (f < firstFreq && f > secondFreq) {
                secondFreq = f;
            }
        }

        // Step 4: Agar secondFreq exist nahi karti → -1
        if (secondFreq == -1) return -1;

        // Step 5: Second freq wale elements mein se chhota dhundho
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondFreq) {
                ans = Math.min(ans, entry.getKey());
            }
        }

        return ans;
    }
}