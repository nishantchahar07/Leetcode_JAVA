class Solution {
    public int nthUglyNumber(int n) {
        int[] arr =  new int[n+1];
        //jisme arr[i] =  ith ugly number --> arr[n] =  nth number
        int c2;
        int c3;
        int c5;
        c2 = c3 =c5 = 1;
        arr[1] = 1;

        for(int i = 2 ; i <=  n ;i++){
            int c2Ugly = arr[c2]*2;
            int c3Ugly = arr[c3]*3;
            int c5Ugly = arr[c5]*5;

            int mini =  Math.min(c2Ugly , Math.min(c3Ugly , c5Ugly));
            arr[i] = mini;

            // now update the counter of ,in vaue 

            if(mini ==  c2Ugly ){
                c2++;
            }
             if(mini ==  c3Ugly ){
                c3++;
            }
             if(mini ==  c5Ugly ){
                c5++;
            }

        }
        return arr[n];
    }
}