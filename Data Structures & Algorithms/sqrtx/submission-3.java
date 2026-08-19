class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = 0;
        while (l<=r){
            int m = l+(r-l)/2;
            long sq = (long)m*m;
            if (sq < x){
                l = m+1;
                res = m;
            }else if (sq > x){
                r = m-1;
            }else{
                return m;
            }
        }
        return res;
    }
}