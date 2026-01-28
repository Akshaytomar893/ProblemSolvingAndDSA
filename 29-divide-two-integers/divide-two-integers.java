class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        byte sign = 1;
        if ((dividend < 0 && divisor >= 0) || (divisor < 0 && dividend >= 0))
            sign = -1;

        long numerator = Math.abs((long) dividend);
        long denominator = Math.abs((long) divisor);

        int ans = 0;
        while (numerator >= denominator) {
            long temp = denominator;
            int count = 1;
            while (numerator >= (temp << 1)) {
                temp <<=1;
                count <<=1;
            }
            numerator -= temp;
            ans += count;
        }

        return sign * ans;
    }
}