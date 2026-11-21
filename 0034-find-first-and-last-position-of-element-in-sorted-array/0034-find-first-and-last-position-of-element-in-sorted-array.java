class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            arr.add(x);
        }

        int[] ans = new int[2];
        ans[0] = arr.indexOf(target);
        ans[1] = arr.lastIndexOf(target);

        return ans;
    }
}