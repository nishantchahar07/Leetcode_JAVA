class Solution {
    public static void get(int idx ,int[] nums ,List<Integer> ll , List<List<Integer>> ans ){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
       
        get(idx+1 ,nums ,  ll, ans );
        ll.add(nums[idx]);
        get(idx+1 ,nums ,  ll, ans );
        ll.remove(ll.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> ll =  new ArrayList<>();
        get(0 , nums ,  ll, ans);
        return ans;
        
    }
}