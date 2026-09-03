class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if (people[0] >= limit){
            return people.length;
        }
        int l = 0;
        int r = people.length - 1;
        int boats = 0;
        int rem = 0;
        while (l<r){
            if (people[r] >= limit){
                boats++;
                r--;
                continue;
            }
            if (people[r] + people[l] <= limit){
                boats++;
                l++;
                r--;
            }else{
                boats++;
                r--;
            }
        }
        if (l==r){
            boats++;
        }
        return boats;
    }
}