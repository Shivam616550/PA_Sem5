class Solution {
    public static void back(int[] candidates, int start, int target, List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList(curr));
            return ;
        }
        if(target < 0) return;
        for(int i = start; i < candidates.length; i++){
            // if(candidates[i] > target) continue;
            curr.add(candidates[i]);
            back(candidates, i, target - candidates[i], curr, ans);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(candidates);

        back(candidates, 0, target, curr, ans);
        return ans;
    }
}