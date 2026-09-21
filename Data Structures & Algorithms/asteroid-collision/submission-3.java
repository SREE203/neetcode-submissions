class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a: asteroids){
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0){
                int diff = a + stack.peek();
                if (diff > 0){
                    a = 0;
                }else if (diff < 0){
                    stack.pop();
                }else{
                    a = 0;
                    stack.pop();
                }
            }
            if (a !=0) stack.push(a);
        }
        int i = stack.size() - 1;
        int[] list = new int[stack.size()];
        while (!stack.isEmpty()){
            list[i--] = stack.pop();
        }
        return list;
    }
}