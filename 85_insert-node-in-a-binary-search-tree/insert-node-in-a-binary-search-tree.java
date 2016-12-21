/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/insert-node-in-a-binary-search-tree
@Language: Java
@Datetime: 16-12-05 04:01
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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
        	return node;
        }

        TreeNode runner = root;
        TreeNode parent = null;
        while (runner != null) {
        	parent = runner;
        	if (runner.val < node.val) {
        		runner = runner.right;
        	} else {
        		runner = runner.left;
        	}
        }
        
        if (parent.val < node.val) {
        	parent.right = node;
        } else {
        	parent.left = node;
        }
        
        return root;
    }
}