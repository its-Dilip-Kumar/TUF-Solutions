class Solution {
    public long countSubstrings(String s) {
        int n = s.length();
        int mask = 0;
        long count = 0;                    // long (bade n ke liye)

        int[] freq = new int[1 << 10];     // 1024 masks
        freq[0] = 1;                       // Empty prefix

        for (int i = 0; i < n; i++) {
            // Current character ka bit toggle karo
            mask ^= (1 << (s.charAt(i) - 'a'));

            // Case 1: Same mask → all even
            count += freq[mask];

            // Case 2: Exactly 1 bit different → one odd
            for (int j = 0; j < 10; j++) {
                count += freq[mask ^ (1 << j)];
            }

            freq[mask]++;
        }
        return (int) count;
    }
}