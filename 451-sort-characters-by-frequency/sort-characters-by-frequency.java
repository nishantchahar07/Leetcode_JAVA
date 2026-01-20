class Solution {
    class Pair{
        char cs;
        int freq;
        public Pair(char cs  , int freq){
            this.cs = cs;
            this.freq =  freq;
        }
    }

    public String frequencySort(String s) {
         PriorityQueue<Pair>  pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
         HashMap<Character , Integer>  map =  new HashMap<>();
        StringBuilder  str = new StringBuilder();
        for(char cs : s.toCharArray()){
            map.put(cs ,  map.getOrDefault(cs , 0)+1);
        }
        for(char cs : map.keySet()){
           pq.add(new Pair(cs , map.get(cs))); 
        }
        while(!pq.isEmpty()){
            Pair p = pq.poll();
           str.append(String.valueOf(p.cs).repeat(p.freq));
        }
        return str.toString();
    }
}