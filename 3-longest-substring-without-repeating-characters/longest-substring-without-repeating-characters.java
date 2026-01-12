class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l= 0;
        int r = 0;
        HashSet<Character> set =  new HashSet<>();

        int n =  s.length();
        int max = 0;
        while(l <= r &&  r < s.length()){
            char ch =  s.charAt(r);
            while(set.contains(ch)){                
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);            
           
            int size = r-l+1;
             max = Math.max(size , max);
              r++;
        }
        return max;
    }
}