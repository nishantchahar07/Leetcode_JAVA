class Solution {
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
        if(hasDuplicate(arr.get(i) ,  temp)){
             exclude  = get(arr , i+1 , n , temp);
        }
        else {
             include  = get(arr , i+1 , n , temp+arr.get(i));
             exclude = get(arr , i+1 , n , temp);
        }
        return Math.max(include , exclude);
    }
    public int maxLength(List<String> arr) {
       String temp = "";
       int n  =  arr.size();
       return get(arr , 0 , n ,  temp); 
    }
}