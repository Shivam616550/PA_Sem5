class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);

        int l = 0,m = 0,h = nums.length - 1;
        while(m <= h){
            if(nums[m] == 0){
                int temp = nums[l];
                nums[l++] = nums[m];
                nums[m++] = temp;
            }
            else if(nums[m] == 1){
                m++;
            }
            else{
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h--] = temp;
            }
        }

    }
}