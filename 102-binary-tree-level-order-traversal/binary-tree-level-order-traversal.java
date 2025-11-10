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
    public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue =  new LinkedList<>();
            List<List<Integer>> ll =  new LinkedList<>();
            if(root == null) return ll;
            queue.add(root);
            while(!queue.isEmpty()){
             int queuelen = queue.size();
            List<Integer> sublist =  new LinkedList<>();
             for(int i = 0 ; i < queuelen ; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right );
                }
                sublist.add(queue.poll().val);

             }
             ll.add(sublist);

            }
            return ll;        
    }
}