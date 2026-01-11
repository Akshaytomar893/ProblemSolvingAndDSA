import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
      String word1 = strs[0], word2 = strs[strs.length - 1];
      int minLen = Math.min(word1.length(), word2.length());
      int index=minLen;
      for(int i = 0; i<minLen; i++){
        if(word1.charAt(i) != word2.charAt(i)){
            index = i;
            break;
        }
      }
      return word1.substring(0, index);
    }
}