class Solution {
    public static boolean caneat(int[] arr , int mid , int h){
        long  count = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] <= mid)count++;
            else if(arr[i] > mid ){
                if(arr[i] % mid == 0){
                    count+=arr[i]/mid;
                }
                else count+=(arr[i]/mid)+1;
            }
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int st = 1;
       int end  = Arrays.stream(piles).max().getAsInt();
       int ans = 0;
       while(st <=  end) {
        int mid  = st + (end-st)/2;
        if(caneat(piles , mid , h)){
            ans = mid;
            end =  mid - 1;
        
        }
        else{
            st =  mid + 1;
        }
       }
       return ans;
    }
}