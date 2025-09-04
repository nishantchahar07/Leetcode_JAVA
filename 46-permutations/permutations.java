class Solution {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void getPermutation(int[] arr, int idx, List<List<Integer>> list, List<Integer> ll) {
        int n = arr.length;
        if (idx == n) {
            System.out.println(arr);
            list.add(new ArrayList(ll));
            return;
        }

        for (int i = idx; i < n; i++) {
            ll.add(arr[i]);
            swap(arr, idx, i);
            getPermutation(arr, idx + 1, list,ll);
            swap(arr, idx, i);
            ll.remove(ll.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {      
        List<List<Integer>> list = new ArrayList<>(); 
        List<Integer> ll = new ArrayList<>();     
          getPermutation(nums, 0, list,ll);
          return list;

    }
}