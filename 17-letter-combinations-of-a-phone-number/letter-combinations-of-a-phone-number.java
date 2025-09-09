class Solution {
            
     String []arr = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    public void getNum(String str , String ans , List<String> ll ){      
        if(str.length() == 0){
            ll.add(ans);
            return;
        }
        
        char ch  = str.charAt(0);
        String key =  arr[ch-'0'];
       for(int i = 0 ; i < key.length(); i++){
        getNum(str.substring(1) , ans+key.charAt(i) , ll);
       }

    }
    public List<String> letterCombinations(String str) {

       
        List<String> ll = new ArrayList<>();
         if(str == null || str.length() == 0)return ll;
        getNum(str  , "" , ll);
        return ll;
    }
}