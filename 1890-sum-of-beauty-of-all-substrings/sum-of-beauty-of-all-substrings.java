class Solution {
    public int beautySum(String s) {
        int sum =0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            HashMap <Character, Integer> freq = new HashMap<>();
            for(int j = i; j < len; j++){
                freq.put(s.charAt(j),  freq.getOrDefault(s.charAt(j), 0) + 1);
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int val : freq.values()) {
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }
                sum += (max - min);
            }
        }
        return sum;
        
    }
}