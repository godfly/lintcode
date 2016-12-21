/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/flip-bits
@Language: Java
@Datetime: 16-11-17 13:30
*/

class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int count = 0;  
        for (int c = a ^ b; c != 0; c = c >>> 1) {
            count += c & 1;
        }
        return count;
    }
};
