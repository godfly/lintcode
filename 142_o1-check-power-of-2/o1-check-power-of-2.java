/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/o1-check-power-of-2
@Language: Java
@Datetime: 16-11-19 05:43
*/

class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here        
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
};