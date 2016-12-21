/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/climbing-stairs
@Language: Java
@Datetime: 16-12-17 13:49
*/

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int[] DP = new int[n + 1];
        DP[0] = 1;
        DP[1] = 1;
        for (int i = 2; i <= n; i++) {
            DP[i] = DP[i - 1] + DP[i - 2];
        }
        return DP[n];
    }
}