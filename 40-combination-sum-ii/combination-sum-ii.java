class Solution {
    public static void getSum(int[] arr , int idx , int target , List<Integer> ll,List<List<Integer>> list , HashSet<List<Integer>> set  ){
        if(target == 0){
            if(!set.contains(ll)){
                set.add(new ArrayList<>(ll)); 
                list.add( new ArrayList(ll));
            }
            return;
        }

        if(idx == arr.length || target < 0)return;

        ll.add(arr[idx]);
        getSum(arr , idx+1 , target-arr[idx] , ll , list , set);
        ll.remove(ll.size()-1);
        int next = idx+1;
        while(next < arr.length && arr[next] == arr[next-1]){
            next++;
        }
        getSum(arr , next, target , ll , list , set);
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        HashSet< List<Integer>> set =  new HashSet<>();
        
        Arrays.sort(arr);
        int idx = 0;
        getSum(arr, idx, target , ll , list , set);
        return list; 


        
        
    }
}