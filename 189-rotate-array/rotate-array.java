class Solution {
    public void rotate(int[] nums, int k) {
       
        int len = nums.length;
         int normalisedK = k%len;
        int start=0;
        int end = len-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
        start = 0;
        end = normalisedK-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
        start = normalisedK;
        end=len-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}