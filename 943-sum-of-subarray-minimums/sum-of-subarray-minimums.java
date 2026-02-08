import java.util.Stack;
class Solution {

    private int[] findNextSmallerElementIndex(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1; i >=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }
    private int[] findPreviousSmallerOrEqualIndex(int[] arr){
        int[] psee = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNextSmallerElementIndex(arr);
        int[] psee = findPreviousSmallerOrEqualIndex(arr);
        long total = 0; 
        long mod = 1000000007;
        for(int i = 0; i<arr.length; i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            total =( total + (1L * right * left * arr[i]) % mod) % mod;
        }
        return (int)total;
    }
}