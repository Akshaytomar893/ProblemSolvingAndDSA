class Solution {
    //Recursive method:

    // private void getSubsets(int nums[], List<Integer> subset, int index, List<List<Integer>> result) {
    //     if (index >= nums.length) {
    //         result.add(new ArrayList<>(subset));
    //         return;
    //     }
    //     getSubsets(nums, subset, index + 1, result);
    //     int ele = nums[index];
    //     subset.add(ele);
    //     getSubsets(nums, subset, index + 1, result);
    //     subset.remove(subset.size() - 1);
    // }

    // public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> subset = new ArrayList<>();
    //     getSubsets(nums, subset, 0, result);
    //     return result;
    // }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsetCount = 1 << n;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}