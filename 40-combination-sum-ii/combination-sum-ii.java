class Solution {
    private void findCombination(int index, int target, List<Integer> combination, List<List<Integer>> result,
            int[] arr) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            combination.add(arr[i]);
            findCombination(i + 1, target - arr[i], combination, result, arr);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        findCombination(0, target, combination, result, candidates);

        return result;
    }
}