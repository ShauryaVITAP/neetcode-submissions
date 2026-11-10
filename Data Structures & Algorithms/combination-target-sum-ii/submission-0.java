
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);

        solve(0, candidates, target, list, ans);

        return ans;
    }

    void solve(int index, int[] arr, int target,
               List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            list.add(arr[i]);

            solve(i + 1, arr, target - arr[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}
