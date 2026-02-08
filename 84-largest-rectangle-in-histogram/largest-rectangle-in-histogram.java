import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        int maxSum = 0;
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int ele = st.peek();
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxSum = Math.max(maxSum, heights[ele] * (nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse = heights.length;
            int ele = st.peek();
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxSum = Math.max(maxSum, heights[ele] * (nse-pse-1));
        }
        return maxSum;
    }
}