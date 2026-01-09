import java.util.*;
class Solution {
    int calculatePosibleValueOfK(int[]arr, int m){
        int ans = 1;
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
           if(sum + arr [i] <= m){
            sum+=arr[i];
           }
           else{
            ans++;
            sum = arr[i];
           }
        }
        return ans;
    }
    public int splitArray(int[] nums, int k) {
        int high = Arrays.stream(nums).sum();
        int low = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = (low + high)/2;
            int possibleK = calculatePosibleValueOfK(nums, mid);
            if(possibleK > k) low = mid + 1;
            else high = mid - 1;

        }
        return low;
    }
}