class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalkamai = 0;
        int totalkharcha  = 0;
        for(int i = 0 ; i < gas.length ; i++){
            totalkamai+=gas[i];
            totalkharcha+=cost[i];
        }
        if(totalkamai <totalkharcha ) return -1;
          int total = 0;
       
         int result  = 0;
         int i = 0;

        while(i < n){           
            total += gas[i]-cost[i];
             if(total < 0 ){
                total = 0;
                result = i+1;
                i++;
                continue;
             }
            i++;
            
        }
        return result;
    }
}