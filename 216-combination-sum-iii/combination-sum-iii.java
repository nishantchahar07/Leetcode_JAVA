class Solution {
    public void get(int k, int n , List<List<Integer>>  ans , List<Integer>  ll  , int start  ){

        if(ll.size() > k )return;
        if(ll.size() == k && n == 0){
            ans.add(new ArrayList(ll));
            return;
        }
        for(int i =  start ; i <= 9; i++){
            ll.add(i);
             get(k , n-i , ans  , ll,  i+1);
             ll.remove(ll.size()-1);
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>  ans  =  new ArrayList<>();
        List<Integer>  ll =  new ArrayList<>();
        get(k , n , ans  , ll,  1);
        return ans;

    }
}