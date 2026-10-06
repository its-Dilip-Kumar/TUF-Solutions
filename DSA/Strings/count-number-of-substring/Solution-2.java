class Solution {
    public long countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[10];   // 'a' to 'j'
            int oddCount = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;

                // Odd count update karo
                if (freq[idx] % 2 == 1) oddCount++;
                else oddCount--;

                if (oddCount <= 1) count++;
            }
        }
        return count;
    }
}