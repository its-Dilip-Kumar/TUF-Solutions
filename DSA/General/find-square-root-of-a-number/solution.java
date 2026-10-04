class Solution {
    public int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;   // ✅ Dono handle

        int start = 1, end = n / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {         // ✅ Overflow-safe
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}