class Solution {
    class Pair {
        int idx;
        int pos;

        public Pair(int idx, int pos){
        this.idx =  idx;
        this.pos =  pos;
    }
    }
    public List<Integer> survivedRobotsHealths(int[] posn, int[] health, String dir) {
        Pair[] arr =  new Pair[posn.length];
        List<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> st =  new Stack<>();
        
        for(int i = 0 ; i < posn.length ; i++){
            arr[i] =  new Pair(i , posn[i]);
        }

        Arrays.sort(arr , (a , b ) -> a.pos - b.pos);
     for(int i = 0 ; i < arr.length ; i++){
        int index =  arr[i].idx;
        if(dir.charAt(index) == 'R'){
            st.push(index);
        }
        else{
            while(!st.isEmpty() && health[index] > 0){
                if(health[index] == health[st.peek()]){
                     health[index] = 0;
                    health[st.peek()] = 0;
                    st.pop();
                }
                else if(health[index] < health[st.peek()]){
                    health[st.peek()]--;
                    health[index] = 0;
                }
                else{
                    health[index]--;
                    health[st.peek()] = 0;
                    st.pop();
                }           
            
                 }  
                
    }
}
 for(int i = 0 ; i < health.length ; i++){
                    if(health[i] > 0) ans.add(health[i]);
                 } 
        return  ans;

    }
}