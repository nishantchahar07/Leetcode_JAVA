class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int end = 0;
        int ans = 0;
        int max = 0;
        HashMap<Character , Integer> map =  new HashMap<>();
        while(end < s.length()){
            if(map.containsKey(s.charAt(end))){
                while( st <= end && s.charAt(st) != s.charAt(end)){
                    map.put(s.charAt(st) , map.get(s.charAt(st))-1);
                    if(map.get(s.charAt(st)) == 0) map.remove(s.charAt(st));
                    st++;

                }
                 map.put(s.charAt(st) , map.get(s.charAt(st))-1);
                    if(map.get(s.charAt(st)) == 0) map.remove(s.charAt(st));
                st++;
            }
            map.put(s.charAt(end) , map.getOrDefault(s.charAt(end) , 0)+1);
            ans =  end-st+1;
            max =  Math.max(ans , max);
            end++;
        }
        return max;
    }
}