/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/compare-strings
@Language: Java
@Datetime: 16-11-07 07:39
*/

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A == null || B == null) 
            return false;
        if (A.length() < B.length()) 
            return false;
        
        final int UPPER_NUM = 26;
        int[] letter_cnt = new int[UPPER_NUM];
        
        for (int i = 0; i < A.length(); i++) {
            letter_cnt[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++) {
            letter_cnt[B.charAt(i) - 'A']--;
            if (letter_cnt[B.charAt(i) - 'A'] < 0) 
                return false;
        }
        return true;
    }
}