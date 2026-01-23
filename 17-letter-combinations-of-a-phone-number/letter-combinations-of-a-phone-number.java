import java.util.*;
class Solution {
private Map<Character, Character[]> getMap() {
    Map<Character, Character[]> map = new HashMap<>();

    map.put('2', new Character[]{'a', 'b', 'c'});
    map.put('3', new Character[]{'d', 'e', 'f'});
    map.put('4', new Character[]{'g', 'h', 'i'});
    map.put('5', new Character[]{'j', 'k', 'l'});
    map.put('6', new Character[]{'m', 'n', 'o'});
    map.put('7', new Character[]{'p', 'q', 'r', 's'});
    map.put('8', new Character[]{'t', 'u', 'v'});
    map.put('9', new Character[]{'w', 'x', 'y', 'z'});

    return map;
}
    private void findCombo(int index, String digits, String currString, List<String> ans,  Map<Character, Character[]> map){
        if(index >= digits.length()){
            ans.add(currString);
            return;
        }
        for(char c: map.get(digits.charAt(index))){
            findCombo(index+1, digits, currString+c, ans, map);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String>  ans = new ArrayList<>();
         Map<Character, Character[]> map = getMap();
         if(digits.length() == 0) return ans;
         findCombo(0, digits, "", ans, map);
         return ans;    }
}