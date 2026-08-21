class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> f1 = new HashMap<>();
        HashMap<Character, Integer> f2 = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            f1.put(s.charAt(i), f1.getOrDefault(s.charAt(i), 0) + 1);
            f2.put(t.charAt(i), f2.getOrDefault(t.charAt(i), 0) + 1);
        }
        return f1.equals(f2);
    }
}