/**
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


**/
class Solution {
    public int minDepth(TreeNode root) {
        return minDepthB(root, 0);
    }
    
    
    public static int minDepthB(TreeNode root, int depth)
    {
        if(root==null)
        {
            //System.out.println("depth " + depth);
            return depth;
        }
        
        if(root.left==null)
            return minDepthB(root.right, depth+1);
        
        if(root.right==null)
            return minDepthB(root.left, depth+1);
        
        return Math.min(minDepthB(root.left, depth), minDepthB(root.right, depth))+1;
    }
}
