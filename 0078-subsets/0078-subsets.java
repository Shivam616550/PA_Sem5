class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public static void back(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[i]);
        back(nums, i+1, curr, ans);
        curr.removeLast();
        back(nums, i+1, curr, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        back(nums, 0, curr, ans);
        return ans;
    }
}