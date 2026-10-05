class Solution {

    public static boolean isPossible(int[] C, int B, int A, long mid) {
        long maxBoards = mid / B;       // ✅ Time → boards
        int painters = 1;
        long sum = 0;

        for (int num : C) {
            if (sum + num > maxBoards) {
                painters++;
                sum = num;
            } else {
                sum += num;
            }
        }
        return painters <= A;
    }

    public int paint(int A, int B, int[] C) {
        long maxBoard = 0, totalBoards = 0;
        for (int num : C) {
            maxBoard = Math.max(maxBoard, num);
            totalBoards += num;
        }

        long start = maxBoard * B;          // ✅ Min time
        long end = totalBoards * B;         // ✅ Max time
        long ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (isPossible(C, B, A, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) (ans % 10000003);      // ✅ Mod (problem ke hisaab se)
    }
}