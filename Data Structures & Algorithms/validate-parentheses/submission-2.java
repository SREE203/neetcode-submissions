class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('}', '{');
        hm.put(')', '(');
        hm.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (hm.containsKey(c)){
                if (!stack.isEmpty() && hm.get(c) == stack.peek()){
                    stack.pop();
                } 
                else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
