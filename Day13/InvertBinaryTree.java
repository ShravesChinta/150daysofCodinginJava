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
 
 Given the root of a binary tree, invert the tree, and return its root.

 

Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []

**/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        BFSInvert(root);
        return root;
    }
    
    public static void BFSInvert(TreeNode root)
    {
        if(root==null|| root.left==null && root.right==null)
            return;
        
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    
        BFSInvert(root.right);
        BFSInvert(root.left);
    }
}
