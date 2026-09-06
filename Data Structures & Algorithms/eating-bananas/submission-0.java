class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = piles[0];
        for (int i = 0; i<piles.length; i++){
            k = Math.max(piles[i], k);
        }
        int l = 1;
        int r = k;
        int res = k;
        while (l<=r){
            int m = l + (r-l)/2;
            double time = 0;
            for (int p : piles){
                time += Math.ceil((double) p / m);
            }
            if (time <= h){
                res = Math.min(res, m);
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return res;
    }
}
