class Solution {
    public boolean isword(char ch){
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')return true;
        else return false;
    }
    public boolean isPalindrome(String s) {
        String ans = "";        
        for(int i = 0 ; i < s.length() ; i++){ 
           if(isword(s.charAt(i))){
            ans += Character.toLowerCase(s.charAt(i));
 
                  }  
                  } 
        
        int i = 0;
        int j = ans.length()-1;
        while(i< j){
            if(ans.charAt(i) != ans.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    
}
}