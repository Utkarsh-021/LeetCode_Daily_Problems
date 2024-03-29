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
    List<Integer> arr=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root !=null)
            traversal(root);
        return arr;
    }
    public void traversal(TreeNode root){
        if(root.left!=null) traversal(root.left);
        arr.add(root.val);
        if(root.right!=null) traversal(root.right);
    }
}