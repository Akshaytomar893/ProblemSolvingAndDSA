class Solution {
    public String largestOddNumber(String num) {
        int lastIndex = -1;
        String ans = "";
        boolean isOddFound = false;
        for(int i = num.length() - 1 ; i >= 0; i--){
            if(!isOddFound && (int)num.charAt(i)%2 == 1 ){
                isOddFound = true;
            }
            if(isOddFound){
                ans = num.charAt(i)+ans;
            }
        }
       return ans;
    }
}