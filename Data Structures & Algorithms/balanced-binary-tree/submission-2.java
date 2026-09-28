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

    private boolean is_balanced = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        height(root);
        return is_balanced;
    }

    private int height(TreeNode node){
        if (node == null) return 0;

        int leftheight = height(node.left);
        int rightheight = height(node.right);

        int balance_factor = Math.abs(leftheight - rightheight);
        if (balance_factor > 1) is_balanced = false;

        return Math.max(leftheight, rightheight) + 1;
    }
}
