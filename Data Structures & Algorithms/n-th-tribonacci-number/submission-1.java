class Solution {

    private int[] cache;

    public int tribonacci(int n) {
        this.cache = new int[n+1];
        return tribonacci_helper(n);
    }

    private int tribonacci_helper(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        if (cache[n] != 0) return cache[n];

        cache[n] = tribonacci_helper(n-1)+tribonacci_helper(n-2)+tribonacci_helper(n-3);
        return cache[n];
    }
}