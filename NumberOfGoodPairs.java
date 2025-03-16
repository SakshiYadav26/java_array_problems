// https://leetcode.com/problems/number-of-good-pairs/description/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int element:nums){
            if(map.containsKey(element)){
                count+=map.getOrDefault(element, 0);
                map.put(element, map.getOrDefault(element, 0)+1);
            }
            else{
                map.put(element,1);
            }
        }
        return count;



        // for(int i=0; i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        
    }
}
