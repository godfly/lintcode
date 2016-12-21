```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/ugly-number-ii
@Language: Markdown
@Datetime: 16-09-20 03:55
```

    public int nthUglyNumber(int n) {
        // Write your code here
        int num = n;
        int count = 0;
        int a = 0;
        while(count<n){
            a++;
            int m = a;
            while(m%2 ==0){
                m = m/2;
            }
            while(m%3 ==0){
                m = m/3;
            }
            while(m%5 ==0){
                m = m/5;
            }
            if(m == 1){
                count++;
            }
        }
        return a;
    }
超时