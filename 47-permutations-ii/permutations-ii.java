class Solution {
    public static void swap(int[] arr , int idx , int i){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;

    }
    public static void getPermutation(int[] arr , int idx , List<Integer> ll, List<List<Integer>> list , HashSet< List<Integer>> set){
        int n = arr.length;
        if(idx == n){
            if(!set.contains(ll)){
                set.add(ll);
            list.add(new ArrayList(ll));
            return;
            }
        }
        for(int i = idx ; i < n ; i++){
            ll.add(arr[i]);
            swap(arr , idx , i);
            getPermutation(arr ,  idx+1 , ll , list , set);
            swap(arr , idx , i);
            ll.remove(ll.size()-1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet< List<Integer>> set =  new HashSet<>();
        List<List<Integer>> list =  new ArrayList<>();
        List<Integer> ll =  new ArrayList<>();
        getPermutation(nums, 0 , ll , list , set );
      
        return list;
    }
}