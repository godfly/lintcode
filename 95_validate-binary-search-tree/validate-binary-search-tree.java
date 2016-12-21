/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/validate-binary-search-tree
@Language: Java
@Datetime: 16-12-05 05:49
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean helper(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        
        if (node.val >= max || node.val <= min) {
            return false;
        }
        
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}