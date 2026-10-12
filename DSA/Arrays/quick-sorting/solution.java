class Solution {

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(nums, low, high);
            quickSort(nums, low, pivotIdx - 1);
            quickSort(nums, pivotIdx + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];   // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Pivot ko sahi jagah rakho
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}