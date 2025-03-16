// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<candies.length;i++){
            if(candies[i]>largest){
                largest=candies[i];
            }
        }
        

        for(int i=0; i<candies.length;i++){
            if(candies[i]+extraCandies>= largest){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
