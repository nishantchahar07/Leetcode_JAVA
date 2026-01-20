class Solution {

    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int x : piles) {
            pq.add(x);
            sum += x;
        }

        while (k-- > 0) {
            int val = pq.poll();
            int removed = val / 2;
            sum -= removed;          // 🔥 directly update sum
            pq.add(val - removed);
        }

        return sum;
    }
}
