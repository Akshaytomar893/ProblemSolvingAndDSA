class Solution {
    long calcTotalHours(int[] piles, int speed){
        long hr = 0;
        for(int i = 0; i< piles.length; i++){
            int pile = piles[i];
                hr+= (int)Math.ceil((double)pile/speed);
        }
        return hr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int ans= end;
        while(start <= end){
            int mid = start + (end - start) / 2;;
            long totalHourRequired = calcTotalHours(piles, mid);
            if(totalHourRequired <= h){
                ans = mid;
                end = mid - 1;
            }
            else{
                start =mid + 1;
            }
        }
        return ans;
    }
}