class Solution {
    public void sortColors(int[] arr) {
     int lo = 0;
     int mid = 0;
     int high = arr.length-1;
     while(mid <= high){
        if(arr[mid] == 0){
            int temp =  arr[lo];
            arr[lo] = arr[mid];
            arr[mid] =  temp;
            lo++;
            mid++;
        }
        else if(arr[mid] == 2){
             int temp =  arr[high];
            arr[high] = arr[mid];
            arr[mid] =  temp;
            high--;
        }
           
        else{
            mid++;
        }
     }   
    }
}