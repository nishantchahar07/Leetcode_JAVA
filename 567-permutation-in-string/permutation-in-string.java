class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character , Integer> map1 =  new HashMap<>();
       HashMap<Character , Integer> map2 =  new HashMap<>();

       for(int i = 0 ; i < s1.length(); i++){
           map1.put(s1.charAt(i) , map1.getOrDefault(s1.charAt(i) , 0)+1);

       }
       int len =  s1.length();
       int st = 0;
       int end = 0;
         while(end < s2.length() ){           
         map2.put(s2.charAt(end) , map2.getOrDefault(s2.charAt(end) , 0)+1);

        if(end-st+1 == len){
            if(map2.equals(map1))return true;
            char ch = s2.charAt(st);
         map2.put(ch , map2.get(ch)-1);
         if(map2.get(ch) == 0 )map2.remove(ch);
            
            st++;

        }
         end++;  
         }
     
        return false;


    }
}