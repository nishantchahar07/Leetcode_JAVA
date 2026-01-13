class Solution {
    static Map<String ,  Integer> map =  new HashMap<>();
    public boolean hasDuplicate(String arr , String temp ){
        int[] freq =  new int[26];
        for(char i : arr.toCharArray()){
            if(freq[i-'a'] > 0) return true;
            freq[i-'a']++;
        }
         for(char i : temp.toCharArray()){
            if(freq[i-'a'] > 0)return true;
            
        }
        return false;
        

    }
    public int get(List<String> arr ,  int i , int n , String  temp){
        int exclude = 0;
        int include= 0;
        if( i >= n)return temp.length() ;
        String key =  i+" "+temp;
        if(map.containsKey(key))return map.get(key);
        if(hasDuplicate(arr.get(i) ,  temp)){
             exclude  = get(arr , i+1 , n , temp);
             
             
        }
        else {
             include  = get(arr , i+1 , n , temp+arr.get(i));
             exclude = get(arr , i+1 , n , temp);
        }
       int ans = Math.max(include , exclude);
       map.put(key , ans);
       return ans;
    }
    public int maxLength(List<String> arr) {
        map.clear();
       String temp = "";
       int n  =  arr.size();
       return get(arr , 0 , n ,  temp); 
    }
}