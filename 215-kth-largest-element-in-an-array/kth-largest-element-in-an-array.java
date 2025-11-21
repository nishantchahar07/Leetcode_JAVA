class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while(i < nums.length){
                while(i < nums.length &&  pq.size() <= k){
            pq.offer(nums[i++]);
            
        }
        if(pq.size() > k)pq.poll();
      
        }
        return pq.poll();
    }
}