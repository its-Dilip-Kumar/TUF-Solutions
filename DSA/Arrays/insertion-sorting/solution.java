class Solution {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];    // Current element
            int j = i - 1;

            // Key se bade elements ko right shift karo
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Key ko sahi jagah par rakho
            nums[j + 1] = key;
        }
        return nums;
    }
}