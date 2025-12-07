class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> mp =  new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(int i = 0 ; i < nums.length ; i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0)+1);

        }
      pq.addAll(mp.entrySet());
      
      int[] ans =  new int[k];
      for(int i =  0 ; i < k ;i++){
        ans[i] = pq.poll().getKey();
      }
        return ans;
                        
    }
}