class Solution { 
    
    public int minStoneSum(int[] arr, int k) {
          PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
          for(int i = 0 ; i < arr.length ; i++){
            pq.add(arr[i]);
          }
          while(pq.size() > 0 && k > 0){
            int val = pq.poll();
            int ans =  val - (int) Math.floor(val/2);
            if(ans != 0)pq.add(ans);
            k--;
          }

          int  sum = 0;
          while(!pq.isEmpty()){
            sum+=pq.poll();
          }
          return sum ;
    }
}