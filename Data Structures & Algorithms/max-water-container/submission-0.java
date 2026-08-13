class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxarea = 0;
        while (l < r){
            int area = (r-l)*Math.min(heights[l], heights[r]);
            maxarea = Math.max(area, maxarea);
            if (heights[l]<=heights[r]){
                l += 1;
                continue;
            }else{
                r-=1;
            }
        } 
        return maxarea;
    }
}
