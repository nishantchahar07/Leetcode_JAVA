import java.util.*;

class Solution {
    public boolean isvalid(int[] arr, long mid, int h) {
        long count = 0; 
        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] + mid - 1) / mid; 
            if (count > h) return false; 
        }
        return count <= h;
    }

    public int minEatingSpeed(int[] arr, int h) {
        long st = 1; 
        long end = Arrays.stream(arr).max().getAsInt();
        long ans = end;

        while (st <= end) {
            long mid = st + (end - st) / 2; 
            if (isvalid(arr, mid, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return (int) ans; 
    }
}
