class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character , Integer> map1 =  new HashMap<>();
        HashMap<Character , Integer> map2 =  new HashMap<>();
        List<Integer> ll = new ArrayList<>();

        int len = p.length();
        for(int i = 0 ; i < p.length() ; i++){
            map1.put(p.charAt(i) , map1.getOrDefault(p.charAt(i) , 0)+1);
        }
        int st = 0;
        int end = 0;
        while(end < s.length()){
            char ch = s.charAt(end);
            map2.put(s.charAt(end) , map2.getOrDefault(s.charAt  (end), 0)+1);     
            if(end-st+1 > len){
                char ch1  = s.charAt(st);
                    map2.put(ch1 , map2.get(ch1)-1);
                    if(map2.get(ch1) == 0 ) map2.remove(ch1);
                st++;
            }

            if(map1.equals(map2)) {
                ll.add(st);
            }
             end++;
        }

    return ll;
    }
}