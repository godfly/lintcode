```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/climbing-stairs
@Language: Markdown
@Datetime: 16-12-17 13:49
```

public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int last = 1, lastlast = 1;
        int now = 0;
        for (int i = 2; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
    }
}