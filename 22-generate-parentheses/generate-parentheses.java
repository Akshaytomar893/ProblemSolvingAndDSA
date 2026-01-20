import java.util.List;
import java.util.ArrayList;
class Solution {
    private boolean isValidCombination(String str){
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
    private void generateAllCombination(String str, int n,  List<String> result){
        if(str.length() == 2*n){
            if(isValidCombination(str)){
                result.add(str);
            }
            return;
        }
        generateAllCombination(str+'(', n, result);
        generateAllCombination(str+')', n, result);

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateAllCombination("", n, ans);
        return ans;
    }
}