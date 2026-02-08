class Solution {
    public String removeKdigits(String num, int k) {
        String result = "";
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
        while (!st.isEmpty()) {
            result = st.peek() + result;
            st.pop();
        }
        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }
        return result.substring(i);
    }
}