import java.util.ArrayList;
import java.util.List;

class Solution {
    private void findCombination(int index, int target, List<Integer> combination,  List<List<Integer>> result, int[] arr ){
        if(index >= arr.length){
            if(target == 0){
                result.add(new ArrayList<>(combination));
            }
            return;
        }
        int ele = arr[index];
        // Non - pick
        findCombination(index + 1, target, combination, result, arr);

        //Pick
        if(ele <= target){
            combination.add(ele);
            findCombination(index, target - ele, combination, result, arr);
             combination.remove(combination.size() - 1);

        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        findCombination(0, target, combination, result, candidates);

        return result;
    }
}