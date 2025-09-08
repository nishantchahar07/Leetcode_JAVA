class Solution {
    public static void getSum(int[] arr , int idx , int target , List<Integer> ll ,  List<List<Integer>> list){
        if(idx == arr.length || target < 0)return;
        if(target == 0){

            list.add(new ArrayList(ll));
            return;
        }
       ll.add(arr[idx]);
       getSum(arr , idx , target-arr[idx] , ll , list )  ;
       ll.remove(ll.size()-1);
    //    idx+=1;
       getSum(arr , idx+1 , target , ll , list )  ;
       
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
           List<List<Integer>> list =  new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        getSum(arr , 0 , target ,  ll , list);
        return list;
    }

}