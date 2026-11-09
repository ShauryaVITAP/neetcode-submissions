
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;

            for (int j = 0; j < n; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    index = j;
                }
            }

            ans = max;
            nums[index] = Integer.MIN_VALUE;
        }

        return ans;
    }
}

