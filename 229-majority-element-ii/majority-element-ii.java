import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maxCount = nums.length/3;
        HashMap <Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        map.forEach((key, val)->{
            if(val>maxCount){
                result.add(key);
            }
        });
        return result;
    }
}