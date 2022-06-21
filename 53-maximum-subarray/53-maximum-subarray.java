class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax=-1000000;
        int localMax=0;
        for(int i:nums){
            localMax+=i;
            if(globalMax<localMax)
                globalMax=localMax;
            if(localMax<0)
                localMax=0;
    }
        return globalMax;
}
}