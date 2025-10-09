class Solution {
    public int maxScore(int[] arr , int k) {
        int st = 0;
        int end = arr.length-1;
        int ans = 0;
        int max =  0;
        while(st < k){
            ans+=arr[st];
            st++;

        }
        max= Math.max(ans ,  max);
        st--;

        while(st >= 0 && st < arr.length ){
            ans-=arr[st];
            ans+=arr[end];
         max= Math.max(ans ,  max);

            end--;
            st--;
        }
        return max;
    }

}