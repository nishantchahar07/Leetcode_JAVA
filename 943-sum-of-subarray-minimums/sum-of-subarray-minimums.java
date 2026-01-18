class Solution {
    public int[] getNSL(int[] arr , int n ){
        Stack<Integer>  st = new Stack<>();
        int[] result  =  new int[n];
        for(int i =0 ; i < n ; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();                
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }

     public int[] getNSR(int[] arr , int n ){
        Stack<Integer>  st = new Stack<>();
        int[] result  =  new int[n];
        for(int i =n-1 ; i >= 0 ; i--){
            while( !st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();                
            }
            result[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return result;
    }
    public int sumSubarrayMins(int[] arr) {
        //NSL --> next smallest left 
        //Next smallest right chaiye then dono ko multiply kro 
        // utni baar wo number smallest rhga hoga 
        int MOD = 1000000007;
        int n =  arr.length;
        int[] NSL =  getNSL(arr , n);
        int[] NSR =  getNSR(arr ,  n);
        long sum = 0;

        for(int i = 0 ; i < n ; i++){
            int ls =  i - NSL[i];
            int rs = NSR[i] - i;

           long ans = ( (long) arr[i] * ls * rs ) % MOD;
 ;
            sum+=ans ;
        }
        return (int)(sum % MOD);
    }
}