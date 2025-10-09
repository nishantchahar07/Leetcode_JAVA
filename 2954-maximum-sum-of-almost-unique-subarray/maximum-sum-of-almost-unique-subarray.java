class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int st  = 0;
        int end = 0;
        long sum = 0;
        long max = 0;
        HashMap<Integer , Integer> map =  new HashMap<>();
        while(end  < nums.size()){
            int ch = nums.get(end);
            sum+=nums.get(end);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
           while(end-st+1 > k ){
                sum-=nums.get(st);
                map.put(nums.get(st) ,  map.get(nums.get(st))-1);
                if(map.get(nums.get(st)) == 0) map.remove(nums.get(st));
                st++;
           }
           if(end-st+1 == k && map.size() >= m){

            max = Math.max(sum ,  max);

           }
           end++;

            
        }
        return max;
    }
}