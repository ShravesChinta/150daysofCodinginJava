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
 
 Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


 */
class Solution {
    public int minDepth(TreeNode root) {
        return minDepthTree(root);
    }
    
    public static int minDepthTree(TreeNode root)
    {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        if(root.left==null)
        {
            return 1+minDepthTree(root.right);  
        }
        
        if(root.right==null)
        {
            return 1+minDepthTree(root.left);
            
        }
        return 1+Math.min(minDepthTree(root.left),minDepthTree(root.right) );
       
    }
}
