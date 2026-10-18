class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int n : nums){
            heap.add(n);
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = heap.poll();
        }
        return nums;
    }
}