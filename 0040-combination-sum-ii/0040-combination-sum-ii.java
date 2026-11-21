class Solution {
    public static void back(int[] c, int target, int start, List<Integer> curr,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList(curr));
            return;
        }
        if(target < 0) return;
        for(int i = start; i < c.length; i++){
            if (i > start && c[i] == c[i - 1]) {
                continue;
            }
            if (c[i] > target) {
                break;
            }
            curr.add(c[i]);
            back(c, target - c[i], i+1, curr, ans);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(c);
        back(c, target, 0, curr, ans);
        return ans;
    }
}