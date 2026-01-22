class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans = 0;
        PriorityQueue<Integer>  pq1 =  new PriorityQueue<>();
        PriorityQueue<Integer>  pq2 =  new PriorityQueue<>();
        int i = 0 , j = costs.length-1;
        int hired  = 0;
        while(hired < k){

        
        while(pq1.size() < candidates && i <= j ){
            pq1.add(costs[i++]);
        }
        while(pq2.size() < candidates && i <= j ){
            pq2.add(costs[j--]);
        }

        int min_pq1 =  pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
        int min_pq2 =  pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;
    
        if(min_pq1 <= min_pq2){
            ans+=min_pq1;
            pq1.poll();
        }
        else{
             ans+=min_pq2;
            pq2.poll();
        }
        hired++;
        }

        return ans;

    }
}