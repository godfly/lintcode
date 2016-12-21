```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/longest-common-substring
@Language: Markdown
@Datetime: 16-11-07 09:14
```

public class Solution {
    public int longestCommonSubstring(String A, String B) {
        if ((A == null || A.isEmpty()) || (B == null || B.isEmpty())) {
            return 0;
        }
        int lcs = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                int lcs_temp = 0;
                while(i + lcs_temp < A.length()
                      && j + lcs_temp < B.length() 
                      && A.charAt(i + lcs_temp) == B .charAt(j + lcs_temp)){
                    lcs_temp++;
                }
                // update lcs
                if (lcs_temp > lcs) 
                    lcs = lcs_temp;
                }
            }
        return lcs;
    }
}