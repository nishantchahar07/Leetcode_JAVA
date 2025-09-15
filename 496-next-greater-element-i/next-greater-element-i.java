class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
         Stack<Integer> st = new Stack<>();
         int[] arr =  new int [nums2.length];

         for(int i = 0 ; i < nums2.length ; i++){
            while(!st.isEmpty() && nums2[i] > nums2[st.peek()] ){
                arr[st.pop()] = nums2[i];
            }
            st.push(i);
         }
         while(!st.isEmpty()){
            arr[st.pop()] = -1;
         }
     for(int i = 0 ; i < arr.length ; i++){
        map.put(nums2[i] , arr[i]);
     }

     for(int i = 0 ; i < nums1.length ; i++){
        nums1[i] = map.get(nums1[i]);
     }
        return nums1 ;
    }
}