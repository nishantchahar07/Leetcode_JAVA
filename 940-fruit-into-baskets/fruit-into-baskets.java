class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        int end  = 0;
        int st = 0;
        int ans = 0;
        int maxans = 0;
        while(end < fruits.length){
            map.put(fruits[end] , map.getOrDefault(fruits[end] , 0)+1);
            ans+=fruits[end];
            while(map.size() > 2){
                map.put(fruits[st] , map.get(fruits[st])-1);
                if(map.get(fruits[st])== 0)map.remove(fruits[st]);
                ans-=fruits[st];
                st++;
            }
            ans = end-st+1;
            maxans = Math.max(ans , maxans);
            end++;
            
        }
        return maxans;
    }
}