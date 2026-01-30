class Solution {
    public void get(int[] candidates, int target ,   List<List<Integer>> ans ,   List<Integer> ll , int sum,int start ){
        if(sum > target)return;
        if(sum == target){          
            ans.add(new ArrayList<>(ll));           
            return;
        }
        for(int i = start ; i < candidates.length ; i++){          
             sum+=candidates[i];
             ll.add(candidates[i]);
               get(candidates , target , ans , ll , sum , i);
                sum-=candidates[i];
             ll.remove(ll.size()-1); 
                 
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans  =  new  ArrayList<>();
         List<Integer> ll =  new ArrayList<>();      
        
        get(candidates, target , ans , ll , 0, 0);
        return ans;
    }
}