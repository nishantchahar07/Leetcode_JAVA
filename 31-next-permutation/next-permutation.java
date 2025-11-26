class Solution {
    public static void reverse(int []arr){
        int i = 0;
        int j =  arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {
      int n =  arr.length;
      int idx = -1;
      for(int i = n-2 ; i >= 0 ; i--){
        if(arr[i] < arr[i+1]){
            idx = i;
            break;
        }
      }
      System.out.print(idx + " ");
      if(idx == -1) reverse(arr);
      else{
        for(int i = n-1 ; i >= 0 ; i--){
            if(arr[i] > arr[idx] ){
                int temp =  arr[i];
                arr[i] =  arr[idx];
                arr[idx] =  temp;
                  break;
            }            
          
        }
        System.out.print(arr[idx]);
        Arrays.sort(arr,idx+1 , n);

        }
    }
}