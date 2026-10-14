class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Ensure mid is even (pair start)
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pair sahi hai → single right mein
                start = mid + 2;
            } else {
                // Pair toot gaya → single left mein
                end = mid;
            }
        }

        return nums[start];
    }
}