class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] pair = {-1, -1};
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target){
                pair[0] = i+1;
                pair[1] = j+1;
                return pair;
            }else if (numbers[i] + numbers[j] > target){
                j-=1;
            }else{
                i+=1;
            }
        }
        return pair;
    }
}