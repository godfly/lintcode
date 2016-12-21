```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/two-strings-are-anagrams
@Language: Markdown
@Datetime: 16-11-07 08:06
```

    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null || t == null) 
            return false;
        if (s.length() != t.length()) 
            return false;
        final int CHAR_NUM = 256;
        int[] letterCount = new int[CHAR_NUM];
        for (int i = 0; i != s.length(); i++) {
            letterCount[s.charAt(i)]++;
            letterCount[t.charAt(i)]--;
        }
        for (int i = 0; i != CHAR_NUM; i++) {
            if (letterCount[i] != 0) 
            return false;
        }
        return true;
    }