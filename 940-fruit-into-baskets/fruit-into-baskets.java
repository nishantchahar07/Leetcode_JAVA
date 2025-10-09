class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer > map =  new HashMap<>();
        int st = 0;
        int end = 0;
        int ans  = 0;
        int max = 0;       
        while(end < fruits.length){
            int ch  = fruits[end];
            map.put(ch  , map.getOrDefault(ch , 0) + 1);
            while(st <= end && map.size() > 2){
               map.put( fruits[st] , map.get(fruits[st]) - 1);
               if(map.get(fruits[st]) == 0){             
                map.remove(fruits[st]);
               }
               st++;

            }
            ans  =  end-st+1;
            max =  Math.max(ans , max);
            end++;
        }

        return max;
    }
}
