class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String s: operations){
            if (s.equals("C")){
                stack.pop();
            }else if (s.equals("D")){ 
                stack.push(stack.peek() * 2);
            }else if (s.equals("+")){
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(val1);
                stack.push(val2);
                stack.push(val1 + val2);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum; 
    }
}