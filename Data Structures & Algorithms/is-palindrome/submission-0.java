class Solution {
    public boolean isPalindrome(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (i<=j){
            char l = Character.toLowerCase(a[i]);
            char r = Character.toLowerCase(a[j]);
            if (l == ' '){
                i+=1;
                continue;
            }else if (r == ' '){
                j-=1;
                continue;
            }else if (!Character.isLetterOrDigit(l)){
                i+=1;
                continue;
            }else if (!Character.isLetterOrDigit(r)){
                j-=1;
                continue;
            }
            else if (l!=r){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}
