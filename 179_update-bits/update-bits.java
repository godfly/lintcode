/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/update-bits
@Language: Java
@Datetime: 16-11-19 13:46
*/

class Solution {
    /**
     *@param n, m: Two integer
     *@param i, j: Two bit positions
     *return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        // write your code here
        int max = ~0;
        if(j == 31)
            j = max;
        else
            j = (1<<(j+1)) -1;
        int left = max - j;
        int right = ((1<<i) -1);
        int mask = left|right;
        return ((n&mask)|(m<<i));
    //     int max = ~0;
    //     if (j == 31)
    //         j = max;
    //     else
    //         j = (1 << (j + 1)) - 1;
    //         return j;
    //     int left = max - j;
	   // int right = ((1 << i) - 1);
    //     int mask = left | right;
    //     return ((n & mask) | (m << i));
    }
}
