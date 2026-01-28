class Solution {
    public void get(int[] nums ,  List<List<Integer>> ll , List<Integer> ans , int i ){
        if(i == nums.length){
            ll.add(new ArrayList<>(ans) );
            return;
        }

        get(nums , ll , ans , i+1);
        ans.add(nums[i]);
        get(nums , ll , ans , i+1);
        ans.remove(ans.size() - 1);

    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ll = new ArrayList<>();
       List<Integer> ans =  new ArrayList<>();

       get(nums , ll , ans , 0);
       return ll;

    }
}