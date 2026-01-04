class Solution {
    public int get(int[] nums , int i ,  HashMap<Integer, Integer> map ){
        if(i >= nums.length) return 0;
        if(map.containsKey(i))return map.get(i);
         int nrb =  get(nums ,  i+1, map);
        int rb = nums[i]+get( nums , i+2, map);

        int ans = Math.max(rb , nrb) ;
       map.put(i , ans);
       return ans;
       
    }
    public int rob(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return get(nums , 0 ,  map); 
    }
}