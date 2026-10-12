class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> heap = new PriorityQueue<>((p1, p2) -> distance(p2) - distance(p1));

        for (int[] point : points){
            heap.add(point);
            if (heap.size() > k){ 
                heap.poll();
            }
        }

        int[][] res = new int[k][2];

        for (int i=0; i< k; i++){
            res[i] = heap.poll();
        }

        return res; 

    }

    private int distance(int[] p1){
        int d1 = (p1[0]*p1[0]) + (p1[1]*p1[1]);
        return d1;
    }
}
