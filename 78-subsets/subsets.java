import java.util.ArrayList;
import java.util.List;
class Solution {
    private void getSubsets(int nums[], List<Integer> subset, int index, List<List<Integer>> result){
        if(index >= nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
         getSubsets(nums, subset, index + 1, result);
        int ele = nums[index];
        subset.add(ele);
        getSubsets(nums, subset, index + 1, result);
         subset.remove(subset.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        getSubsets(nums, subset, 0, result);
        return result;
    }
}