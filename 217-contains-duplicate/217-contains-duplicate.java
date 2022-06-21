class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for(int i:nums){
            if(numbers.contains(i)){
                return true;
            }
            else{
                numbers.add(i);
            }
        }
        return false;
    }
}