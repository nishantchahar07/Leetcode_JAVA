class Solution {
    public static void generate(int n , int open , int close , String ans  , List<String> ll ){
       
        if(ans.length() == 2*n){
              ll.add(ans); 
              return;            
           
        }
     if(open < n){
       generate(n , open + 1 , close , ans+"(" , ll);
     }
       if(open > close){
      generate(n , open , close+1 , ans+")" , ll );
     }
    
    }
    public List<String> generateParenthesis(int n) {
    String ans = "";
    int open = 0;
    int close = 0;
    List<String> ll = new ArrayList<>();
    
    generate(n , open ,  close , ans , ll );
    return ll;

      
    }
}