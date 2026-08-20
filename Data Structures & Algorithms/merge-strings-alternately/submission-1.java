class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder comb = new StringBuilder("");
        int i = 0;
        while (i<word1.length() && i<word2.length()){
            comb.append(word1.charAt(i));
            comb.append(word2.charAt(i));
            i++;
        }
        if (i<word1.length()){
            comb.append(word1.substring(i));
        }else{
            comb.append(word2.substring(i));
        }
        return comb.toString();
    }
}