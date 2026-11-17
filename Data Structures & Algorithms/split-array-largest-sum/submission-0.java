
class Solution {
    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        for(int i = 0; i < nums.length; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }

        while(left < right) {
            int mid = (left + right) / 2;

            int count = 1;
            int sum = 0;

            for(int i = 0; i < nums.length; i++) {
                sum += nums[i];

                if(sum > mid) {
                    count++;
                    sum = nums[i];
                }
            }

            if(count > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
