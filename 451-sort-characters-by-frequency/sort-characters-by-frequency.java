public class Solution {
    public class Pair {
          char cs;
          int val;
          public Pair(char cs , int val){
            this.cs =  cs;
            this.val =  val;
          }
    }
    public String frequencySort(String s) {
        HashMap<Character , Integer >  map = new HashMap<>();
        for( char ch : s.toCharArray()){
            map.put(ch ,  map.getOrDefault(ch , 0)+1);
        }
        Pair[] arr =  new Pair[map.size()];
        int i = 0;
        for(char ch : map.keySet()){
            arr[i++] =  new Pair(ch ,  map.get(ch));
        }
        Arrays.sort(arr , (a,b) -> b.val-a.val);
        StringBuilder str = new StringBuilder();
        for(int p = 0 ; p < arr.length ; p++){
            for(int n = 0 ; n < arr[p].val ; n++){
                 str.append(arr[p].cs);
            }
           
        }
        return str.toString();
    }
}