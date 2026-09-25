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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)
        {
            return null;
        }
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
    }
    public TreeNode buildTree(int inorder[],int is,int in,int postorder[],int ip,int id,HashMap<Integer,Integer>mp)
        {
          if(is>in || ip>id)
          {
           return null;
          }
          TreeNode root=new TreeNode(postorder[id]);
          int inroot=mp.get(postorder[id]);
          int nleft=inroot-is;
          root.left=buildTree(inorder,is,inroot-1,postorder,ip,ip+nleft-1,mp);
          root.right=buildTree(inorder,inroot+1,in,postorder,ip+nleft,id-1,mp);
          return root;
}
}
