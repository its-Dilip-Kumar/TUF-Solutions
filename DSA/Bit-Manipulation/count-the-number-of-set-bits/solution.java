class Solution {
    public int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1);   // Last bit check
            n >>= 1;            // Right shift
        }
        return count;
    }
}