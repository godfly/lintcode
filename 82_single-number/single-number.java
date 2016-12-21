/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/single-number
@Language: Java
@Datetime: 16-11-20 09:19
*/

public class Solution {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
        // Write your code here
        if(A == null || A.length == 0)  return 0;
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }
}