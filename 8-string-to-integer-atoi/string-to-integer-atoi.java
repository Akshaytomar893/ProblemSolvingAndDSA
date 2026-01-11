class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int i = 0;
        long res = 0;
        int len = s.length();
        while (i < len && s.charAt(i) == ' ')
            i++;
        if (i == len)
            return 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        while(i<len && Character.isDigit(s.charAt(i))){
            res = res*10 + s.charAt(i) - '0';
            i++;
             if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(sign * res);
    }
}