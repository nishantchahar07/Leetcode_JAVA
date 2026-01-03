class Solution {
    public int climb(int n ,   HashMap<Integer ,Integer> map){
        if(n == 0)return 0;
        if(n == 1 || n == 2)return n ;
        if(map.containsKey(n))return map.get(n);
        int one  = climb(n-1 , map);
        int two = climb(n-2 ,  map);
         map.put(n ,  one+two);
       return one+two;

    }
    public int climbStairs(int n) {
        HashMap<Integer ,  Integer> map =  new HashMap<>();
        return climb(n , map);
    }
}