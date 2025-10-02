class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        
        int len = s1.length();        

        // frequency of s1
        for (int i = 0; i < len; i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int st = 0;
        int end = 0;

        while (end < s2.length()) {
            map2.put(s2.charAt(end), map2.getOrDefault(s2.charAt(end), 0) + 1);

            // shrink window if larger than len
            if (end - st + 1 > len) {
                map2.put(s2.charAt(st), map2.get(s2.charAt(st)) - 1);
                if (map2.get(s2.charAt(st)) == 0) {
                    map2.remove(s2.charAt(st));
                }
                st++;
            }

            // check permutation
            if (end - st + 1 == len && map1.equals(map2)) {
                return true;
            }

            end++;
        }

        return false;
    }
}
