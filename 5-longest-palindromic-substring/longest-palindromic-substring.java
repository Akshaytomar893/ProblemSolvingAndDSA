class Solution {
    boolean isPalindrome(String str) {
        if (str == null)
            return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String ans = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String subs = s.substring(i, j + 1);
                if (isPalindrome(subs) && subs.length() > ans.length()) {
                    ans = subs;
                }
            }
        }
        return ans;
    }
}