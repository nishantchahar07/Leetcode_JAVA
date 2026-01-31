class Solution {
    class Pair{
        int a;
        int b;
        public Pair(int a , int b){
            this.a =  a;
            this.b = b;

        }
    }
    public int[][] merge(int[][] arr) {
     Stack<Pair>  st =  new Stack<>();
      Arrays.sort(arr , (a , b) -> a[0]-b[0]);
     for(int i = 0 ; i < arr.length ; i++){
        if(!st.isEmpty() && st.peek().b >= arr[i][0]){
            Pair val = st.pop();
            if(val.b < arr[i][1]){
            st.push(new Pair(val.a , arr[i][1]));
            }
            else{
                st.push(new Pair(val.a , val.b));
            }
        }
        else{
            st.push(new Pair(arr[i][0] ,  arr[i][1]));
        }
     }
      int[][] ans  = new int [st.size()][2];
      int k = 0;
      while(!st.isEmpty()){
        ans[k][0] = st.peek().a;
        ans[k][1] =  st.peek().b;
        st.pop();
        k++;
      }
      return ans;
    }
}