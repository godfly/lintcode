/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/longest-common-prefix
@Language: Java
@Datetime: 16-11-07 13:29
*/

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length == 0){  
            return "";  
        }  
        String first = strs[0];  
        int i, j;  
        boolean match = true;  
        for(i=0; i<first.length() && match; i++){  
            for(j=0; j<strs.length; j++){  
                if(i>=strs[j].length() || strs[j].charAt(i)!=first.charAt(i)){  
                    match = false;  
                    break;  
                }  
            }  
            if(!match){  
                return first.substring(0,i);  
            }  
        }  
          
        return first.substring(0,i);  
    }
}