class Solution {

    public static void insert(int[] nums, int n) {
        // Base case
        if (n <= 1) return;

        // Recursively n-1 sort karo
        insert(nums, n - 1);

        // Last element ko sahi jagah par insert karo
        int key = nums[n - 1];
        int j = n - 2;

        // Recursive shift
        while (j >= 0 && nums[j] > key) {   // ⚠️ Loop allowed nahi
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = key;
    }

    public int[] insertionSort(int[] nums) {
        insert(nums, nums.length);
        return nums;
    }
}