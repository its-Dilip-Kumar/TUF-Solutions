class Solution {
    public void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // Increasing part
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Decreasing part
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}