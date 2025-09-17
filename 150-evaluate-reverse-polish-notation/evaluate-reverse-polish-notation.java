class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st =  new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(tokens[i].equals("+")){
               int e1 = st.pop();
                int e2 = st.pop();
                st.push(e1+e2);
            }
           else if(tokens[i].equals("/")){
               int e2 = st.pop();
                int e1 = st.pop();
               
                 st.push(e1/e2);
            }
           else if(tokens[i].equals("*")){
               int e1 = st.pop();
                int e2 = st.pop();
                st.push(e1*e2);
            }
            else if(tokens[i].equals("-")){
               int e2 = st.pop();
                int e1 = st.pop();
                st.push(e1-e2);
            }
            else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        if(st.isEmpty())return -1;

        else return st.pop();
    }
}