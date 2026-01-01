class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer , Integer> map =  new HashMap<>();
        // made an frequency map 
        for(int i = 0 ; i < nums.length ; i++ ){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);

        }

        // 2 possibilty hai k= 0 || k > 0
        //so for k = 0;
        //if k > 0 --> check for evry key x+k  is present on not
        if(k == 0){
             for(int i : map.keySet()){
            if(map.get(i) > 1)count++;
        }
        }
        else{
             for(int x : map.keySet()){
            if(map.containsKey(x+k))count++;
        }
        }
       

        //if k > 0 --> check for evry key x+k  is present on not

        
        return count;
       

    }
}