import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // 2n iterations (circular) — right to left
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            while (!st.isEmpty() && arr[idx] >= st.peek()) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) ans[idx] = -1;
                else ans[idx] = st.peek();
            }
            st.push(arr[idx]);
        }
        return ans;
    }
}