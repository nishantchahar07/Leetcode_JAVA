class Solution {
    public static void getSubset(int[] arr  ,int idx ,  List<Integer> ll , List<List<Integer>> list ){

        if(idx == arr.length){
         list.add(new ArrayList(ll));
         return ;
        }
     
        getSubset(arr , idx+1 , ll , list);
         ll.add(arr[idx]);
        getSubset(arr , idx+1 ,ll, list) ;
        ll.remove(ll.size()-1);
    }

       
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
         getSubset(nums ,0,ll,list);
         return list;
    }
}