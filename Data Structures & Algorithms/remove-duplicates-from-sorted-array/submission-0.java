class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i<nums.length; i++){
            if (nums[i] == nums[count]){
                continue;
            }else{
                nums[++count] = nums[i];
            }
        }
        return ++count;
    }
}