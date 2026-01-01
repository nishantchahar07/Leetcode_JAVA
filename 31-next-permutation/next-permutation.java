class Solution {
    public void reverse(int[] arr , int i , int j){
        while(i < j){
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;
            i++;
            j--;

        }
    }
    public void nextPermutation(int[] nums) {
        boolean flag =  false;
       for(int i = nums.length-1 ; i > 0 ; i--){
        if(nums[i-1] < nums[i]){
            flag =  true;
            for(int j = nums.length-1 ; j >= i ; j--){
                if(nums[i-1] < nums[j]){
                   int temp =  nums[i-1];
                   nums[i-1] = nums[j];
                   nums[j] = temp;
                    break;
                  
                }
              
            }
            reverse(nums , i , nums.length-1);
             break;


        }       
           
        
       }
       if(!flag){
         reverse(nums , 0 , nums.length-1);
       } 

    }
}