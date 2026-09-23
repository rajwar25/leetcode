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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lt=new ArrayList<>();
        if(root==null)
        {
            return lt;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty())
        {
          int s=q.size();
          List<Integer> ds=new ArrayList<>(Collections.nCopies(s, 0));
          for(int i=0;i<s;i++)
          {
            TreeNode temp=q.peek();
            q.poll();
            int indx=flag?i:(s-1-i);
            ds.set(indx,temp.val);
            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
          }
          flag=!flag;
          lt.add(ds);
        }
        return lt;
    }
}