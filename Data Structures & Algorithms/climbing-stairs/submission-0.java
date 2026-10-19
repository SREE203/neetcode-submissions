class Solution {

    private int[] mem;

    public int climbStairs(int n) {
        this.mem = new int[n+1];
        return climb(n);
    }

    private int climb(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (mem[n] != 0) return mem[n];

        mem[n] = climb(n-1) + climb(n-2);  

        return mem[n];
    }
}
