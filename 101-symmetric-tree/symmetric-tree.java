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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return system(root.left , root.right);
    }


        public static boolean system(TreeNode left ,  TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null)return false;
        if(left.val != right.val)return false;
        boolean t1 = system(left.left , right.right );
        boolean t2 = system(left.right , right.left);
        return t1 && t2;
    }
}