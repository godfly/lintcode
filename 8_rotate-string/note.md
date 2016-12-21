```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/rotate-string
@Language: Markdown
@Datetime: 16-10-13 02:35
```

三个坑：数组为null；offset=0；offset极大；

    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str.length == 0 || offset == 0){
            
        }else{
            offset = offset%str.length;
            for(int j=0;j<offset;j++){
                char m = str[str.length-1];
                for(int i=str.length-1;i>0;i--){
                    str[i] = str[i-1];
                }
                str[0]=m;
            }
        }
    }
	
	Total Runtime: 836 ms