class Solution {
    public boolean isvalid(int[] time, long mid, int k) {
        long trips = 0;
        for (int t : time) {
            trips += mid / t;
            if (trips >= k) return true;  
        }
        return false;
    }

    public long minimumTime(int[] time, int k) {
        long lo = 1;
        long hi = (long) Arrays.stream(time).min().getAsInt() * k;
        long ans = hi;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (isvalid(time, mid, k)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }
}
