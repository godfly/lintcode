/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/maximum-depth-of-binary-tree
@Language: Java
@Datetime: 16-09-19 09:15
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
     * @return: An integer.
     */
     
    public int maxDepth(TreeNode root) {
        // write your code here 
        if(root == null){
            return 0;
        }
        int m = maxDepth(root.left) + 1;
        int n = maxDepth(root.right) + 1;

        return m > n ? m : n ;
    }
}