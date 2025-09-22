class Solution {
    public void moveZeroes(int[] arr) {
        int count = 0;
        int k = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0)count++;
            else{
                arr[k++] = arr[i];

            }
        }
        while(count-- > 0){
            arr[arr.length - 1-count] = 0;
        }

    }
}