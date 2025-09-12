class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set  =  new HashSet<>();
        int end = 0;
        int st = 0;
        int ans = 0;
        int maxans = 0;
        while(  end < s.length()){           
            while(st <= end && set.contains(s.charAt(end))){
                set.remove(s.charAt(st));
                st++;
            }
             set.add(s.charAt(end));
            ans = end-st+1;
            maxans =  Math.max(ans , maxans);
            end++;
        }
    return maxans;
    }
}