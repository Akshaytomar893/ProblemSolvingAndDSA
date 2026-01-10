class Solution {
    public String largestOddNumber(String num) {
        int lastIndex = -1;
        for(int i = num.length() - 1 ; i >= 0; i--){
            if((int)num.charAt(i)%2 == 1 ){
                lastIndex = i;
                break;
            }
        }
       if(lastIndex == -1){
        return "";
       }
       else return num.substring(0, lastIndex+1);
    }
}