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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        boolean ans=recursion(root,targetSum);
        return ans;
    }
    boolean recursion(TreeNode root, int k)
    {
        if(root==null)
        {
            return false;
        }
         if(root.left==null && root.right==null)
        {
            return root.val==k;
        }
        int r=k-root.val;
        return recursion(root.left,r) || recursion(root.right,r);
        }
}