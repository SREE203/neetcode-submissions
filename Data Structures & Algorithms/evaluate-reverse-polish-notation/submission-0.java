class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for (String op : tokens){
            if (op.equals("+")){
                int x = nums.pop();
                int y = nums.pop();
                nums.push(x+y);
            }else if (op.equals("-")){
                int x = nums.pop();
                int y = nums.pop();
                nums.push(y-x);
            }else if (op.equals("*")){
                int x = nums.pop();
                int y = nums.pop();
                nums.push(x*y);
            }else if (op.equals("/")){
                int x = nums.pop();
                int y = nums.pop();
                nums.push(y/x);
            }else{
                nums.push(Integer.parseInt(op));
            }
        }
        return nums.pop();
    }
}
