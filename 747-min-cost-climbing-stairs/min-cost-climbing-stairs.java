class Solution {

    public int get(int[] cost, int i ,  HashMap<Integer , Integer> map) {
        if (i >= cost.length) return 0;
        if(map.containsKey(i))return map.get(i);

        int one = get(cost, i + 1 , map);
        int two = get(cost, i + 2, map);

        int ans  = cost[i] + Math.min(one, two);
        map.put(i , ans);
        return ans;
    }

    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        return Math.min(get(cost, 0 , map), get(cost, 1 , map));
    }
}
