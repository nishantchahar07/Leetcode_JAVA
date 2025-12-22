class Solution {
    public int sum(int n){
        int sum  = 0;
        while(n > 0){
         int digit  =  n % 10;
         sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set =  new HashSet<>();
        while(n != 1){
            int m = n;
            n =  sum(m);
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
        return true;
    }
}