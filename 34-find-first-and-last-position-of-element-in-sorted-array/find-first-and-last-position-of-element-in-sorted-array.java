class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums, target), lastOccurence(nums, target)};
    }
    int firstOccurence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                if(mid > 0 && arr[mid-1] != target){
                    break;
                }
                end = mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid]< target){
                start = mid + 1;
            }
        }
        return res;
    }
    int lastOccurence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid]< target){
                start = mid + 1;
            }
        }
        return res;
    }
}