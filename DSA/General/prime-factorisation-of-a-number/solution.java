import java.util.*;

class Solution {
    public List<List<Integer>> primeFactors(int[] queries) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : queries) {
            List<Integer> temp = new ArrayList<>();
            int n = num;

            // 2 ke saare factors
            while (n % 2 == 0) {
                temp.add(2);
                n /= 2;
            }

            // Odd factors — 3 se √n tak
            for (int j = 3; j * j <= n; j += 2) {
                while (n % j == 0) {
                    temp.add(j);
                    n /= j;
                }
            }

            // Agar n > 1 bacha, toh woh prime hai
            if (n > 1) {
                temp.add(n);
            }

            ans.add(temp);
        }
        return ans;
    }
}