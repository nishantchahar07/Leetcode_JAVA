class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
            String ans =  "";
            for(int i= 0 ; i < s.length() ; i++){
                char ch =  s.charAt(i);
                if(!st.isEmpty() && ch == st.peek()){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            
            while(!st.isEmpty()){
                ans+=st.pop();
                

            }
           return  new StringBuilder(ans).reverse().toString();
            
    }
}