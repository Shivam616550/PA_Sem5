class Solution {
    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void back(int[] nums, int idx, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> p = new ArrayList<>();
            for (int x : nums) p.add(x);
            ans.add(p);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            back(nums, idx + 1, ans);
            swap(nums, idx, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        back(nums, 0, ans);
        return ans;
    }
}