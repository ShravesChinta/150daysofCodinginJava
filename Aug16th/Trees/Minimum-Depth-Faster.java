/***
This is a faster solution
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

***/

class Solution {
    public int minDepth(TreeNode root) {
        return minDepthB(root);
    }
    
    
    public static int minDepthB(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        int depth=0, l=0;
        
        if(root==null)
        return depth;
        
        q.add(root);
        while(q.size()>0)
        {
            depth++;
            l=q.size();
            for(int i=0;i<l;i++)
            {
              
              TreeNode ele=q.remove();
              if(ele.left==null && ele.right==null)
              {
                  return depth;
              }
              if(ele.left!=null)
              {
                  q.add(ele.left);
              }
                
                if(ele.right!=null)
                {
                    q.add(ele.right);
                }
           
            }
          
        }
        return depth;
        
    }
}
