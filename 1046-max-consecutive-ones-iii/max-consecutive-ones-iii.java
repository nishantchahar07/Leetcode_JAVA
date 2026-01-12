class Solution {
    public int longestOnes(int[] arr, int k) {

        int i = 0;
        int max = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == 0) { // bhai phle condn check kiya kr 
                k--;
            }

            while (k < 0) {
                if (arr[i] == 0) {  // then loop kya ab valid hai 
                    k++;
                }
                i++;
            }

            max = Math.max(max, j - i + 1); // check for max 
        }

        return max;
    } 
}
