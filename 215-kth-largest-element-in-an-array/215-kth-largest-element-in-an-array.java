class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int l=nums.length-k;
        for(int j=0;j<l;j++){
            pq.poll();
        }
return pq.peek();

    }
}