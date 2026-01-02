class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int uniqueIndex = 0;
        for(int i = 1; i<len; i++){
            if(nums[i] != nums[uniqueIndex]){
                nums[uniqueIndex + 1] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex+1;
    }
}