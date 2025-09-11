class Solution {
    public  boolean isVowel(char ch){
         String str =  "AEIOUaeiou";   
                 
            if(str.contains(ch + "")){
               return true;
            }
            return false;
        }
    
    public String sortVowels(String s) {
       
        List<Character> ll =  new ArrayList<>();
         StringBuilder sb = new StringBuilder();
          for(int i = 0 ; i < s.length() ; i++){
            if(isVowel(s.charAt(i))) ll.add(s.charAt(i));
          }
         
        Collections.sort(ll);
        int k = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char  ch = s.charAt(i);
            if(isVowel(ch)){
                sb.append(ll.get(k));
                k++;
            }
            else{
              sb.append(s.charAt(i));  
            }
            

        }
       return sb.toString();
        
    }
}