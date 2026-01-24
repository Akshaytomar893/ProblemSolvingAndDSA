import java.util.*;
class Solution {
    private boolean isPalindrome(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start++) != str.charAt(end--))
            return false;
        }
        return true;
    }
    private void findPartition(int index, String str, List<String> currStr, List<List<String>> partitions){
        if(index == str.length()){
            partitions.add(new ArrayList<>(currStr));
            return;
        }
        for(int i = index; i<str.length(); i++ ){
            if(isPalindrome(str, index, i)){
                currStr.add(str.substring(index, i+1));
                findPartition(i + 1, str, currStr, partitions);
                currStr.remove(currStr.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<>();
        List<String> currStr = new ArrayList<>();
        findPartition(0, s, currStr, partitions);
        return partitions;
    }
}