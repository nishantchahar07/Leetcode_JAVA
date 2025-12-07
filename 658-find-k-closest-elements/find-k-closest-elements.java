import java.util.*;

class Pair {
    int key;  
    int val;  

    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> a.key == b.key ? b.val - a.val : b.key - a.key
);


        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pair(diff, arr[i]));

            if (pq.size() > k) {
                pq.poll(); 
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().val);
        }

       
        Collections.sort(ans);
        return ans;
    }
}
