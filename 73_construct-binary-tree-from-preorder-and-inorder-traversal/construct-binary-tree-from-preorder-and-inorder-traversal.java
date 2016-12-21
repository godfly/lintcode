/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/construct-binary-tree-from-preorder-and-inorder-traversal
@Language: Java
@Datetime: 16-12-05 09:55
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
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if (preorder == null || inorder == null) {
            return null;
        }
        return ConstructCore(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode ConstructCore(int[] preOrder, int[] inOrder, int startPreorder, int endPreorder,
            int startInorder, int endInorder) {

        if (startPreorder > endPreorder || startInorder > endInorder) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[startPreorder]);

        int divider = 0;
        while (divider <= endInorder && inOrder[divider] != root.val) {
            divider++;
        }

        int offSet = divider - startInorder - 1;
        root.left = ConstructCore(preOrder, inOrder, startPreorder + 1, startPreorder + 1 + offSet, startInorder,
                startInorder + offSet);
        root.right = ConstructCore(preOrder, inOrder, startPreorder + offSet + 2, endPreorder, divider + 1, endInorder);

        return root;
    }
}