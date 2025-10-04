class Solution {
    public int singleNonDuplicate(int[] arr) {
        int st = 0;
        int end = arr.length-1;
        boolean iseven;        
        while(st < end){
            int mid =  st + (end-st)/2;
            if((end - mid)%2 == 0){
                iseven = true;
            }
            else{
                iseven = false;
            }

            if(arr[mid] == arr[mid+1]){
                if(iseven){
                    st = mid+2;
                }
                else{
                    end  = mid-1;
                }
            }
            else{
                    if(iseven){
                       end =  mid; 
                    }
                    else{
                        st =  mid + 1;
                    }
            }

        }
        return arr[end];
    }
}