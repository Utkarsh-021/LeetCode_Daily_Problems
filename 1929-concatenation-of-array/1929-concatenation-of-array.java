class Solution {
    public int[] getConcatenation(int[] nums) {
        int t=nums.length;
        int[] numss=new int[2*t];
        for(int i=0;i<numss.length;i++){
            numss[i]=nums[i%t];
        }
        return numss;
    }
}