class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int breakPoint = -1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint == -1) {
            int start = 0;
            int end = len-1;
            while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            }
            return;
  
        }
        for (int i = len - 1; i >= breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                int temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        int start = breakPoint + 1;
        int end = len-1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}