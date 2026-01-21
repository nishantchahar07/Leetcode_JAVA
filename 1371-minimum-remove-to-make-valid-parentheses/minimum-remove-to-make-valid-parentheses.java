class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer>  set= new HashSet<>();
        Stack<Integer> st =  new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
          if(s.charAt(i) == '('){
            st.push(i);
          } 
          else if(s.charAt(i) == ')'){
            if(st.isEmpty()){
                set.add(i);
            }
            else{
                st.pop();
            }
          }
        }

          while(!st.isEmpty()){
            set.add(st.pop());
          }
          StringBuilder str= new StringBuilder();
          for(int j =  0 ; j < s.length() ; j++){
            if(!set.contains(j))str.append(s.charAt(j));
          }
        

    
      return str.toString();
}
}
