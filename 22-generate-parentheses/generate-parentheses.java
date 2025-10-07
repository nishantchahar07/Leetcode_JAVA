class Solution {
    public static void gp(int open , int close , int n , String ans ,List<String> ll){
        if(open == n && close == n){
            ll.add(ans);
            return;
        }
        if(open < n)
        gp(open+1 , close , n , ans+"(" , ll);
        if( close < n && open > close)
        gp(open, close+1 , n , ans+")" , ll);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        gp(0 , 0 , n , "" , ll);
        return ll;
    }
}