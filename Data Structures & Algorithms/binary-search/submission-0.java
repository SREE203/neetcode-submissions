class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l<=r){
            int m = (l-r)/2 + r;
            if (nums[m] == target){
                return m;
            }else if (nums[m] > target){
                r = m-1;
                continue;
            }else{
                l = m+1;
                continue;
            }
        }
        return -1;
    }
}
