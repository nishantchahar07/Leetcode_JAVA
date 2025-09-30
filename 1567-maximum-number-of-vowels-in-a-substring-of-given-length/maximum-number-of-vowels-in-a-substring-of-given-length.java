class Solution {
    public static boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')return true ;
        else return false;
    }
    public int maxVowels(String s, int k) {
       int  st = 0;
       int  end = 0;
        int count = 0;  
        int max = 0;         
        while(end < s.length()){
          
           if(end-st+1 > k){ 
             max =  Math.max(count ,  max);
             if(isvowel(s.charAt(st)))count--;          
            st++;
           
            
           }
            if(  isvowel(s.charAt(end))){
            count++;
           }
           end++;
        

        }
        return Math.max(max , count);
    }   
}