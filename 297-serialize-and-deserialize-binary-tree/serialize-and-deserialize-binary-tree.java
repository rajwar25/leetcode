/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode cur=q.poll();
            if(cur==null)
            {
                res.append("null,");
                continue;
            }
            res.append(cur.val+",");
            q.add(cur.left);
            q.add(cur.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")
        {
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        String values[]=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for(int i=1;i<values.length;i++)
        {
           TreeNode parent=q.poll();
           if(!values[i].equals("null"))
           {
            TreeNode l=new TreeNode(Integer.parseInt(values[i]));
            parent.left=l;
            q.add(l);
           } 
           if(!values[++i].equals("null"))
           {
            TreeNode r=new TreeNode(Integer.parseInt(values[i]));
            parent.right=r;
            q.add(r);
           }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));