class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int end = 0;
        int ans = 0;
        int max = 0;
        HashMap<Character , Integer> map =  new HashMap<>();
        while(end < s.length()){
            map.put(s.charAt(end) , map.getOrDefault(s.charAt(end) , 0)+1);
                while( st <= end && map.get(s.charAt(end) )> 1 ){
                    map.put(s.charAt(st) , map.get(s.charAt(st))-1);
                    if(map.get(s.charAt(st)) == 0) map.remove(s.charAt(st));
                    st++;

                }
                 
            ans =  end-st+1;
            max =  Math.max(ans , max);
            end++;
        }
        return max;
    }
}