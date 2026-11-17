
//import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {

                int left = j+1;
                int right = n-1;

                while(left < right) {

                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
