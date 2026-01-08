class Solution {
    static HashMap<String , Integer> map =  new HashMap<>(); 
    public int get(int cc  , int cr , int m , int n){
        if(cc >= m  || cr >= n)return 0;    
        if(cc == m-1 && cr == n-1)return 1;
        String  key = cc+"-"+cr;
        if(map.containsKey(key))return map.get(key);

        int right =  get( cc+1 , cr ,  m , n );
        int bottom =  get( cc , cr+1 ,  m , n );
        int ans = right+bottom;
        map.put(key ,  ans );
        return ans;

    }
    public int uniquePaths(int m, int n) {
        map.clear();
        return get( 0 , 0 ,  m , n );
    }
}