class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public int numSquares(int n) {
    
        if (n == 0) return 0;

        if (map.containsKey(n)) return map.get(n);

        int mini = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int result = 1 + numSquares(n - i * i);
            mini = Math.min(mini, result);
        }

        map.put(n, mini);
        return mini;
    }
}
