/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/trailing-zeros
@Language: Java
@Datetime: 16-09-20 02:33
*/

class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long count = 0;
        if(n<5){
            return 0;   
        }
        for(long i=5; n/i!= 0; i*=5){
            count += n/i ;
        }
        return count;
    }
};
