class Solution {
     private void findCombination(int index, List<Integer> combination, List<List<Integer>> result,
            int[] arr) {
            result.add(new ArrayList<>(combination));
        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1])
                continue;


            combination.add(arr[i]);
            findCombination(i + 1, combination, result, arr);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
                List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        findCombination(0, combination, result, nums);

        return result;
    }
}