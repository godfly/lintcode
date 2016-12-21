/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/a-b-problem
@Language: Java
@Datetime: 16-09-20 01:51
*/

class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        int tmp;
        while(b != 0){
            tmp = a & b;
            a   = a ^ b;
            b   = tmp << 1;
        }
        return a;
    }
};