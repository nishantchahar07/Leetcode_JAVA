class Solution {
    public static boolean isvalid(int[] arr , int mid , int m ,int k){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] <= mid){
                count++;
                if(count == k){
                    m--;
                    count = 0;
                }
            }
            else{
                count = 0;
            }
            
            i++;
        }
        return m <= 0;
    }
    public int minDays(int[] arr, int m, int k) {
        int st = 0;
        int end = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while(st <=  end){
            int mid = st + (end-st)/2;
            if(isvalid(arr , mid ,  m , k)){
                ans =  mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
}