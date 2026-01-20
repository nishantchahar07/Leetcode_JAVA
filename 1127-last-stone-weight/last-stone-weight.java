class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int a = pq.poll();
            int b =  pq.poll();
            int ans =  Math.abs(a-b);
            if(ans != 0)pq.add(ans);
        }
        if(pq.size()== 0)return 0;
        else return pq.peek();
            }
}