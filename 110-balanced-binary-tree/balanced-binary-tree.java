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
    public int ht(TreeNode root , int count){
        if(root == null)return 0;
        

        int left = ht(root.left , count+1);
        int right  = ht(root.right  , count+1);
        return Math.max(left ,  right)+1;
    } 
    public boolean isBalanced(TreeNode root) {
        if(root ==  null)return true;

        boolean left =  isBalanced(root.left);
        boolean right =  isBalanced(root.right);
        boolean sd =  Math.abs(ht(root.left , 0 ) - ht(root.right , 0)) <= 1;

        return left && right && sd;
        
        
    }
}