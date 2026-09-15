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
        List<Integer> lt=new ArrayList<>();
        TreeNode temp=root;
        getans(lt,temp);
        return lt;

    }
    public void getans(List<Integer> lt, TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        lt.add(root.val);
        getans(lt,root.left);
        getans(lt,root.right);
    }
}