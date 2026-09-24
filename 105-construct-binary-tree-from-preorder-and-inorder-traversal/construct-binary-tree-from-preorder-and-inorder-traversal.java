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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    public TreeNode buildTree(int[] preorder,int pres, int prnd, int[] inorder,int ins,int ind, HashMap<Integer,Integer>mp)
    {
    if(pres>prnd || ins>ind)
    {
        return null;
    }
    TreeNode root=new TreeNode(preorder[pres]);
    int inr=mp.get(root.val);
    int inl=inr-ins;
    root.left=buildTree(preorder,pres+1,pres+inl,inorder,ins,inr-1,mp);
    root.right=buildTree(preorder,pres+inl+1,prnd,inorder,inr+1,ind,mp);
    return root;
}
}