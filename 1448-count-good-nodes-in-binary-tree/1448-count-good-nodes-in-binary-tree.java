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
    public int goodNodes(TreeNode root) {
        return checker(root,-10000);
    }
    public int checker(TreeNode root,int max){
        if(root==null) return 0;
        else{
            int temp=0;
            if(max>root.val){
                temp=0;
            }
            else{
                temp=1;
                max=root.val;
            }
            temp+=checker(root.left,max);
            temp+=checker(root.right,max);
            return temp;
        }
    }
}