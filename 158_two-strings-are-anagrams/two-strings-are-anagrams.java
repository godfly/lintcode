/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/two-strings-are-anagrams
@Language: Java
@Datetime: 16-11-07 08:06
*/

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    // write your code here
    public boolean anagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        String sss = new String(ss);
        String ttt = new String(tt);
        return sss.equals(ttt);
    }
};