

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);

        for (int n : nums) {
            Map<Integer, Integer> next = new HashMap<>();

            for (int sum : dp.keySet()) {
                next.put(sum + n, next.getOrDefault(sum + n, 0) + dp.get(sum));
                next.put(sum - n, next.getOrDefault(sum - n, 0) + dp.get(sum));
            }

            dp = next;
        }

        return dp.getOrDefault(target, 0);
    }
}

