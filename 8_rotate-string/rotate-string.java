/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/rotate-string
@Language: Java
@Datetime: 16-10-13 02:35
*/

public class Solution {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str == null || str.length == 0){
            
        }else{
            offset = offset % (str.length);
            reverse(str, 0, str.length - offset - 1);
            reverse(str, str.length - offset, str.length - 1);
            reverse(str, 0, str.length - 1);
        }
    }
        
        //Helper function: reverse certain range of array
        public void reverse(char[] str, int start, int end) {
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
}