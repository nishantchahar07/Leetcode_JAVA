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

        // Max-heap on (diff, then val)
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.key != b.key) {
                // bada diff upar (max-heap by diff)
                return Integer.compare(b.key, a.key);
            }
            // diff same ho to bada value upar (taaki chhota value bache)
            return Integer.compare(b.val, a.val);
        });

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pair(diff, arr[i]));

            if (pq.size() > k) {
                pq.poll(); // sabse door / worst element nikal do
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
