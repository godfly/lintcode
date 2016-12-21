/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/delete-digits
@Language: Java
@Datetime: 16-11-22 13:32
*/

public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        StringBuffer sb = new StringBuffer(A);
		int i, j;
		for (i = 0; i < k; i++) {
			for (j = 0; j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1); j++) {
			}
			sb.delete(j, j + 1);
		}
        while (sb.length() > 1 && sb.charAt(0)=='0')
            sb.delete(0,1);
		return sb.toString();
    }
}