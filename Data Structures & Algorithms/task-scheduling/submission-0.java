class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char ch : tasks){
            freq[ch - 'A'] += 1;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq){
            if (f > 0){
                heap.add(f);    
            } 
        }
        Queue<int[]> queue = new LinkedList<>();
        int time = 0;

        while (!queue.isEmpty() || !heap.isEmpty()){
            time++;
            if (heap.isEmpty()){
                time = queue.peek()[1];
            }else{
                int count = heap.poll() - 1;
                if (count > 0){
                    queue.offer(new int[]{count, time+n});
                }
            }

            if (!queue.isEmpty() && queue.peek()[1] == time){
                heap.add(queue.poll()[0]);
            }
            
        }

        return time;
    }
}
