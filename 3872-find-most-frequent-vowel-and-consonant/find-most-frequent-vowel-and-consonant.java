class Solution {
    public boolean isvowel(char ch ){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
         HashMap<Character, Integer> map2 = new HashMap<>();
         int vmax = 0;
         int cmax = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(isvowel(s.charAt(i))){
            map1.put( s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0)+1);
            }
            else{
              map2.put(s.charAt(i) , map2.getOrDefault(s.charAt(i) , 0)+1);  
            }
                
                for(char k : map1.keySet()){
                    vmax = Math.max(vmax , map1.get(k));
                }
                for(char k : map2.keySet()){
                    cmax = Math.max(cmax , map2.get(k));
                }


        }
        return vmax + cmax;
    }
}