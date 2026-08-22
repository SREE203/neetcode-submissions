class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length-1;
        while (i<=j){
            int m = (j-i)/2 + i;
            int l = 0;
            int r = matrix[m].length-1;
            boolean flag = false;
            while (l<=r){
                int m1 = (r-l)/2 + l;
                if (matrix[m][m1] == target){
                    return true;
                }else if (matrix[m][m1] > target){
                    r = m1-1;
                    flag = true;
                    continue;
                }else{
                    l = m1+1;
                    flag = false;
                }
            }
            if (flag){
                j = m-1;
            }else{
                i = m+1;
            }
        }
        return false;
    }
}
