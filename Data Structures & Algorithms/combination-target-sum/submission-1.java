
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(0, nums, target, list, ans);

        return ans;
    }

    void solve(int index, int[] arr, int target,
               List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Pick the current element
        list.add(arr[index]);
        solve(index, arr, target - arr[index], list, ans);

        // Remove the current element
        list.remove(list.size() - 1);

        // Not pick the current element
        solve(index + 1, arr, target, list, ans);
    }
}

