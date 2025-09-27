class Solution {
    public static boolean isvalid(int[] arr, int mid, int m, int k) {
        int count = 0;  
        int bouquets = 0; 
        
        for (int i : arr) {
            if (i <= mid) {   
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0; 
                }
            } else {
                count=0;
            }
        }
        
        return bouquets >= m;
    }
     
    public int minDays(int[] arr, int m, int k) {
        
        if ((long) m * k > arr.length) return -1;
        
        int lo = 1;
        int hi = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (isvalid(arr, mid, m, k)) {
                ans = mid;   
                hi = mid - 1;
            } else {
                lo = mid + 1; 
            }
        }
        
        return ans;
    }
}