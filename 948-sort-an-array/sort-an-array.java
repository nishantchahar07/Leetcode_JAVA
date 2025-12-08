class Solution {
    public int[] merge(int[] arr1 ,  int[] arr2){
        int i = 0, j = 0, k = 0;
        int[] arr = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        } 
        while(i < arr1.length) arr[k++] = arr1[i++];
        while(j < arr2.length) arr[k++] = arr2[j++];

        return arr;
    }

    public int[] sort(int[] nums, int st, int end){
        if(st >= end){                       
            return new int[]{ nums[st] };
        }

        int mid = st + (end - st) / 2;

        int[] a = sort(nums, st, mid);        
        int[] b = sort(nums, mid + 1, end);   

        return merge(a, b);
    }

    public int[] sortArray(int[] nums) {
        return sort(nums, 0, nums.length - 1);   
    }
}
