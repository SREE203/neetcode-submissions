class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int stone : stones){
            heap.add(stone);
        }

        while (heap.size() > 1){
            int x = heap.poll();
            int y = heap.poll();

            if (x < y) heap.add(y-x);
            else if (y < x) heap.add(x-y);
            else continue;
        }

        if (!heap.isEmpty()) return heap.poll();

        return 0;
    }
}
