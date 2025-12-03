class Solution {
    public int maxProfit(int[] arr) {
        Stack<Integer> st =  new Stack<Integer>();
        int sum  = 0;
        int  prevmin  =  arr[0];
        
         for(int i  = 0 ;  i < arr.length ; i++){
            if(st.isEmpty() || st.peek() < arr[i]){
                st.push(arr[i]);
            }
            else{
                sum +=  st.peek() - prevmin;
                prevmin =  arr[i];
                st.push(arr[i]);

            }
         }
         sum+=st.peek() - prevmin;
         return sum;

    }
}