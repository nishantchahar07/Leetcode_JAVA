import java.util.*;

class Solution {
    public int GCD(int a , int b ){
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

    public int LCM(int a , int b){
        return (a / GCD(a , b)) * b; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int i = 0;

        while(i < nums.length){
            int curr = nums[i];

        
            while(!st.isEmpty() && GCD(st.peek(), curr) > 1){
                curr = LCM(st.pop(), curr); 
            }

            st.push(curr); 
            i++;
        }
        
        List<Integer> ll = new ArrayList<>();
        while(!st.isEmpty()){
            ll.add(st.pop());
        }
        Collections.reverse(ll);
        return ll;
    }
}
