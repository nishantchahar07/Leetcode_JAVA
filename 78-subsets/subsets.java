class Solution {
    public static void superset(int i , int[] nums ,  List<Integer> ll ,   HashSet<List<Integer>> set  ){
        if(i > nums.length ) return ;
        if(i == nums.length ){
            set.add(new ArrayList<>(ll));
            return;
        }
        superset(i+1 ,  nums ,  ll ,  set);
      ll.add(nums[i]);
superset(i + 1, nums, ll, set);
ll.remove(ll.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans =  new ArrayList<>();
     List<Integer> ll =  new ArrayList<>();
     HashSet<List<Integer>> set = new HashSet<>();
     superset(0 , nums , ll , set );
    for (List<Integer> l : set) {
    ans.add(l);
}

     return ans;
    }
}