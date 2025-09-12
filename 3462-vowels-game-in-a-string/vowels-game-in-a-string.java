class Solution {    

    public boolean doesAliceWin(String s) {
        String  str = "AEIOUaeiou";
        List<Character> ll = new ArrayList<>();
   
     for(int i = 0 ; i < s.length() ; i++){  
        char ch =  s.charAt(i);         
        if(str.contains(ch + "")) ll.add(ch);
            }
             if(ll.size() > 0) return true;
     else return false;
     }
    
    }
