class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();  
        
        int n =  nums.length;
        int[] arr = new int[2*nums.length];
        int[] ans  = new int[2*nums.length];
        for(int i = 0 ; i  < arr.length ;i++){
            arr[i] = nums[i%n];
        }
        for(int i  = 0 ; i < arr.length ; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
            ans[st.pop()] = arr[i];

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }

        for(int i = 0 ; i < nums.length ; i++){
            nums[i]  = ans[i];
        }
        return nums;
        
    }
}