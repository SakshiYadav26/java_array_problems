// https://leetcode.com/problems/number-of-good-pairs/description/

import java.util.HashMap;

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



        
    }
}
