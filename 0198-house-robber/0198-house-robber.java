class Solution {
    public int rob(int[] nums) {
        int rob = 0 ;
        int maxrob = 0;
        for(int num : nums){
            int temp = Math.max(maxrob, rob + num);
            rob = maxrob;
            maxrob = temp;
        }
        return maxrob;
    }
}