/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/binary-tree-serialization
@Language: Java
@Datetime: 16-10-13 07:57
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */
class Solution {
     /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
     public String serialize(TreeNode root) {
     // write your code here
        if(root == null){
            return "#,";
        }
        String mid = root.val +",";
        String left = serialize(root.left);
        String right = serialize(root.right);
        mid = mid + left + right;
        return mid;
     }
     
     /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
     private String data = "";
     public TreeNode deserialize(String data) {
     // write your code here
        this.data = data;
        return desHelper();
        
     }
     
    public TreeNode desHelper(){
        if(this.data.indexOf("#,") == 0){
            this.data = this.data.substring(this.data.indexOf(",") + 1);
            return null;
        }
        String midVal = this.data.substring(0,this.data.indexOf(","));
        TreeNode mid = new TreeNode(Integer.parseInt(midVal));
        this.data = this.data.substring(this.data.indexOf(",") + 1);
        TreeNode left = desHelper();
        TreeNode right = desHelper();
        mid.left = left;
        mid.right = right;
        return mid;
    }
}
