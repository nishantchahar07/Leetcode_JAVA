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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll =  new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null)return new ArrayList<>();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode val = st.pop();
            ll.add(val.val);
            if(val.right != null){
                st.push(val.right);

            }
            if(val.left != null){
                st.push(val.left);

            }

        }
        return ll;

    }
}