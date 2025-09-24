/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

        public static int getsum(TreeNode root , int num){
            if(root == null)return 0;
            if(root.left == null && root.right == null)return num * 10 + root.val;



            int left = getsum(root.left , num*10+root.val);
            int right= getsum(root.right , num*10+root.val);
            return left+right;
        }








    public int sumNumbers(TreeNode root) {
        int ans =  getsum(root , 0);
        return ans;
    }
}