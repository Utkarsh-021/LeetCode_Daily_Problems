public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){return new int[]{-1,-1};}
        
        int leftBoundary = binarySearch(nums, 0, nums.length-1, -1, true, target);
        int rightBoundary = binarySearch(nums, 0, nums.length-1, -1, false, target);
        
        return new int[]{leftBoundary, rightBoundary};
    }
    
    private int binarySearch(int a[], int start, int end, int lastSeen, boolean left, int target){
        if(start > end){ return lastSeen; }
        
        int mid = (start + end) / 2;
        
        if(a[mid] == target){ lastSeen = mid;}
        
        if(target < a[mid] || (target == a[mid] && left)){
            return binarySearch(a, start, mid-1, lastSeen, left, target);
        }else{
            return binarySearch(a, mid+1, end, lastSeen, left, target);
        }
    }
}