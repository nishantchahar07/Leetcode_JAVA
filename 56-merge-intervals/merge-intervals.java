class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr ,  (a1 , b1) -> a1[0] - b1[0]);
        List<int[]> ll = new ArrayList<>();
        int start = arr[0][0];
        int end =  arr[0][1];

        for(int i = 1 ; i < arr.length ; i++){
          int s = arr[i][0];
          int e =  arr[i][1];
          if(end >= s){
                end =  Math.max(end , e);
                
          }
          else{
            ll.add(new int[]{start , end});
              start  =  s;
              end =  e;
          }
        }
        ll.add(new int[]{start , end});
       return ll.toArray(new int[0][]);

        
    }
}