/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/search-a-2d-matrix-ii
@Language: Java
@Datetime: 16-10-29 08:08
*/

public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        int result = 0;
        int rLength = matrix.length;
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int cLength = matrix[0].length;
        if(matrix[0][0] > target || matrix[rLength - 1][cLength - 1]<target){
            return result;
        }
        int i=rLength - 1,j=0;
        while(i >= 0 && j < cLength){
            if(matrix[i][j] == target){
                result++;
                i--;j++;
            }else if(matrix[i][j] < target){
                j++;
            }else{
                i--;
            }
        }
        return result;
    }
}
