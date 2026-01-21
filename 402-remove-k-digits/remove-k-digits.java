class Solution {
    public String removeKdigits(String nums, int k) {
        Stack<Character>  st = new Stack<>();
        if(nums.length() == k)return "0";
        for(int i = 0 ; i < nums.length() ; i++){            
            while(!st.isEmpty() && k > 0 && st.peek() > nums.charAt(i)){
                st.pop(); 
                k--;               
            }
            st.push(nums.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty() && k-- > 0){
            st.pop();
           
        }
        while(!st.isEmpty()){
                str.append(st.pop());
        }
       String result = str.reverse().toString().replaceFirst("^0+", "");
       if(result.length() == 0)return "0";
       return result;
    }
}