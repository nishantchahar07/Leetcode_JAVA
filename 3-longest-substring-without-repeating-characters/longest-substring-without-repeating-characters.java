class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character , Integer> map = new HashMap<>();
    
        int st = 0;
        int end = 0;
        int ans  = 0;
        int max =0;
        while(end < s.length()){            
            while(map.containsKey(s.charAt(end))){
                map.remove(s.charAt(st));
                          
                st++;
            }
            map.put(s.charAt(end) ,1 );
            ans =  end-st+1;
            max =  Math.max(ans , max);
            end++;

        }
        return max;
    }
}