class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st =  new Stack<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(arr[i].equals("C")){
                st.pop();
            }
            else if(arr[i].equals("+")){
               int  e1 = st.pop();
               int  e2 = st.pop();
                st.push(e2);
                st.push(e1);
                st.push(e1+e2);
            }
            else{
                st.push(Integer.valueOf(arr[i]));
            }
        }
        int sum = 0;
    while(!st.isEmpty()){
        sum+=st.pop();
    }
    return sum;
    }
}