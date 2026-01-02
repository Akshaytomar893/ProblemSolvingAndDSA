class Solution {
    public boolean check(int[] nums) {
        int breakCount = 0;
       if(nums.length <=1){
        return true;
       }
        for(int i =0; i<nums.length-1; i++){
           if(nums[i]>nums[i+1]){
            ++breakCount;
           }
        }
        if(nums[0] < nums[nums.length-1]){
           ++breakCount;
        }
       if(breakCount <= 1){
        return true;
       }
       else{return false;}
    }
}