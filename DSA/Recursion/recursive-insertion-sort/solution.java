class Solution {

    // Insert last element ko sahi jagah par
    public static void insert(int[] nums, int n) {
        // Base case: single element ya empty
        if (n <= 1) return;

        // Recursively pehle n-1 elements sort karo
        insert(nums, n - 1);

        // Last element ko sahi jagah par insert karo
        int last = nums[n - 1];
        int j = n - 2;

        // J ko shift karo — lekin loop nahi, recursion
        shift(nums, j, last);
    }

    // Recursive shift
    public static void shift(int[] nums, int j, int key) {
        // Base case: j < 0 ya nums[j] <= key
        if (j < 0 || nums[j] <= key) {
            nums[j + 1] = key;
            return;
        }

        // Shift nums[j] ko right
        nums[j + 1] = nums[j];

        // Recursively aage badho
        shift(nums, j - 1, key);
    }

    public int[] insertionSort(int[] nums) {
        insert(nums, nums.length);
        return nums;
    }
}