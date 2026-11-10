
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(0, target, nums, ans, list);

        return ans;
    }

    void solve(int index, int target, int[] arr,
               List<List<Integer>> ans, List<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        list.add(arr[index]);

        solve(index, target - arr[index], arr, ans, list);

        list.remove(list.size() - 1);

        solve(index + 1, target, arr, ans, list);
    }
}
