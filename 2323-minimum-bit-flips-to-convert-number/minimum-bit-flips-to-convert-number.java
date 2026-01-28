class Solution {
    public int minBitFlips(int start, int goal) {
        int resultant = start ^ goal;
        int count = 0;
        while(resultant !=0){
            if((resultant & 1) != 0) count++;
            resultant=resultant >> 1;
        }
        return count;
    }
}