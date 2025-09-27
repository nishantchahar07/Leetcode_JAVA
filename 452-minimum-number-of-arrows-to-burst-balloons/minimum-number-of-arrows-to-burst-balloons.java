class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{
             
           return Integer.compare(a[0],b[0]);
        });

        int c = 1;
        long end = points[0][1];
        for(int[] a : points){
            long e1 = a[0];
            long e2 = a[1];           
            if(e1 > end){
                c++;
                end = e2;
            }
            else{
                end = Math.min(end,e2);
            }
        }
        return c;
        }
}
