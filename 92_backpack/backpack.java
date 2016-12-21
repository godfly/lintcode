/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/backpack
@Language: Java
@Datetime: 16-12-17 14:20
*/

public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        int row = A.length + 1;
        int col = m + 1;
        boolean[][] pick = new boolean[row][col];
        pick[0][0] = true;
        
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // if we can achieve volume j at index i, 
                // we can also achieve it at index i + 1.
                pick[i][j] = pick[i - 1][j];
                // if we pick element at index i, previous i -1 index should
                // be able to achieve j - A[i - 1]
                if (j >= A[i - 1] && pick[i - 1][j - A[i - 1]]) {
                    pick[i][j] = true;
                }
            }
        }
        
        for (int j = col - 1; j >= 0; j--) {
            if (pick[row - 1][j]) {
                return j;
            }
        }
        
        return 0;
    }
}