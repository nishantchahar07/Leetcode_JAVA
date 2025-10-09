class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int end = 0;
        int ans = 0;
        int max = 0;
        HashSet<Character> set=  new HashSet();
        while(end < s.length()){
            char ch =  s.charAt(end);
           if(set.contains(ch)){
            while( st <= end && set.contains(ch)){                
                set.remove(s.charAt(st));
                st++;
            }
           }
           set.add(ch);        
                 
            ans =  end-st+1;
            max =  Math.max(ans , max);
            end++;
        }
        return max;
    }
}