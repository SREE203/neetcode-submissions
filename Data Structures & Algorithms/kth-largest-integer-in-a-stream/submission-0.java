class KthLargest {

    private int k;
    private PriorityQueue<Integer> minHeap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();

        for (int num : nums){
            minHeap.offer(num);
            if (minHeap.size() > this.k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
