class Solution {
    public boolean validateStackSequences(int[] pushed, int[] poped) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        for( i = 0 ; i < pushed.length ; i++){
            st.push(pushed[i]);
            while( !st.isEmpty() && j < poped.length && poped[j] ==  st.peek() ){
                st.pop();
                j++;
            }
        }
        return st.isEmpty() && j == poped.length;
    }
}