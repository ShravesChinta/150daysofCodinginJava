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
 
 
 This question is similar to kth smallest element in bst, just place root.right first and then root.left , since in a bst, right side value is greater than left side 
 */
class Solution {
 
    public int kthSmallest(TreeNode root, int k) {
        int[] nums=new int[2];
        inOrderTraversal(root,k,nums);
        return nums[1];
    }
    
    public static void inOrderTraversal(TreeNode root,int k,int[] nums)
    {
        if(root==null)
            return;
            
        inOrderTraversal(root.right,k,nums);
        if(++nums[0]==k)
        {
            nums[1]=root.val;
            return;
        }
        inOrderTraversal(root.left,k,nums);
      
    }
}
