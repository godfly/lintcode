/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/longest-common-substring
@Language: Java
@Datetime: 16-11-07 09:14
*/

public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        if ((A == null || A.isEmpty()) || (B == null || B.isEmpty())) {
            return 0;
        }
        int n = A.length();
        int m = B.length();
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    f[i + 1][j + 1] = 1 + f[i][j];
                }
            }
        }
        // find max lcs
        int lcs = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (f[i][j] > lcs) 
                    lcs = f[i][j];
            }
        }
        return lcs;
    }
}