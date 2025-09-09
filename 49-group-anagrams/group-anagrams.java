class Solution {
 
        public static String getFreq(String str){
            StringBuilder sb = new StringBuilder();
             int []arr =  new int[26];
        for(int i = 0 ; i < str.length() ; i++){
            arr[str.charAt(i) - 'a']++;
        }
        for(int i : arr){
            sb.append(i + "lendi");
        }
        return sb.toString();

        }
          

    public List<List<String>> groupAnagrams(String[] str) {
         List<List<String>> list =  new ArrayList<>();
         HashMap<String , List<String>> map =  new HashMap<>();
         for(int i = 0 ; i < str.length ; i++ ){
            if(!map.containsKey(getFreq(str[i]))){
            map.put(getFreq(str[i]) , new ArrayList<>());
            }
            map.get(getFreq(str[i])).add(str[i]);
         } 
         for(String i : map.keySet()){
            list.add(map.get(i));
         }
         return list;
    }

}