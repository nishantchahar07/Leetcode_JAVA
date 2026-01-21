class Solution {
    public int[] getNSL(int[] height) {
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nsl;
    }


    public int[] getNSR(int[] height) {
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int[] nsr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nsr;
    }

    public int getArea(int[] height) {
        int[] nsl = getNSL(height);
        int[] nsr = getNSR(height);

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

 
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int maxArea = 0;

        for (int j = 0; j < m; j++) {
            height[j] = matrix[0][j] - '0';
        }
        maxArea = getArea(height);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                } else {
                    height[j] += 1;
                }
            }
            maxArea = Math.max(maxArea, getArea(height));
        }

        return maxArea;
    }
}
