```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/anagrams
@Language: Markdown
@Datetime: 16-11-07 08:01
```

public class Solution {
    public List<String> anagrams(String[] strs) {
        ArrayList<String> list = new ArrayList<String>();
        if(strs == null){
            return list;
        }
        for(int i = 0; i <strs.length; i++){  
            for(int j=i+1;j<strs.length; j++){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[i]);
                }
            }
        }  
        return list;
    }
    
    private boolean isAnagram(String s, String t) {
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
}