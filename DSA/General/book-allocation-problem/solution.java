class Solution {

    public static boolean isPossible(int[] nums, int mid, int m) {
        int student = 1;              
        int sum = 0;

        for (int num : nums) {
            if (sum + num > mid) {
                student++;             
                sum = num;
            } else {
                sum += num;
            }
        }
        return student <= m;           
    }

    public int findPages(int[] nums, int m) {
        int n = nums.length;
        if (m > n) return -1;          

        int start = 0, end = 0;
        for (int num : nums) {
            start = Math.max(start, num);   
            end += num;                      
        }

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(nums, mid, m)) {
                ans = mid;              
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}