class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] ret = {0, 0};
        for (int i = 0; i<nums.length; i++){
            if (seen.containsKey(target-nums[i])){
                ret[0] = seen.get(target-nums[i]);
                ret[1] = i;
                return ret;
            }
            seen.put(nums[i], i);
        }
        return ret;
    }
}
