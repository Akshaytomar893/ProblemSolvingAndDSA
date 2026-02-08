class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && (st.peek() - '0' > num.charAt(i) - '0')) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if (st.isEmpty())
            return "0";
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        String result = sb.toString();
        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }
        return result.substring(i);
    }
}