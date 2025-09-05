class Solution {
         public static void getSubset(int[] arr  ,int idx ,  List<Integer> ll , List<List<Integer>> list ,  HashSet<List<Integer>> set ){

        if(idx == arr.length){
            if(!set.contains(ll)){
                set.add(ll);
         list.add(new ArrayList(ll));        
         
            }
            return;
        }
         
     
        getSubset(arr , idx+1 , ll , list, set);
         ll.add(arr[idx]);
        getSubset(arr , idx+1 ,ll, list , set) ;
        ll.remove(ll.size()-1);
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> list =  new ArrayList<>();
        HashSet<List<Integer>> set =  new HashSet<>();

        getSubset(nums , 0, ll , list , set);
        return list;
    }
}