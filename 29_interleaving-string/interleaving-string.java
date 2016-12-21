/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/interleaving-string
@Language: Java
@Datetime: 16-10-25 07:32
*/

public class Solution {
    /**
     * Determine whether s3 is formed by interleaving of s1 and s2.
     * @param s1, s2, s3: As description.
     * @return: true or false.
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.length() + s2.length() != s3.length())
            return false;
        // if(s1.equals("")&& s2.equals(s3))
        //     return true;
        // if(s2.equals("")&&s1.equals(s3))
        //     return true;
        boolean[][] matched= new boolean[s1.length()+1][s2.length()+1];
        matched[0][0]= true;
        for(int i1=1;i1<= s1.length(); i1++){
            if(s3.charAt(i1-1) == s1.charAt(i1-1))
                matched[i1][0] = true;
        }
        for(int i2= 1;i2<= s2.length();i2++){
            if(s3.charAt(i2-1) == s2.charAt(i2-1))
                matched[0][i2] = true;
        }
        for(int i1=1;i1<=s1.length(); i1++){
            char c1 = s1.charAt(i1-1);
            for(int i2 = 1;i2<= s2.length();i2++){
                int i3 = i1+ i2;
                char c2 = s2.charAt(i2- 1);
                char c3 = s3.charAt(i3 -1);
                if(c1 == c3)
                    matched[i1][i2] =matched[i1][i2] || matched[i1-1][i2];
                if( c2== c3)
                    matched[i1][i2] = matched[i1][i2] || matched[i1][i2-1];
                    
            }
        }
        return matched[s1.length()][s2.length()];
    }
}