```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/minimum-window-substring
@Language: Markdown
@Datetime: 16-10-26 08:35
```


    public String minWindow(String source, String target) {
        // write your code
        int len1 = source.length();
        int len2 = target.length();
        if(len1 < len2)
            return "";
        String result = "";
        // 统计target 中各个字符串出现的次数
        HashMap<Character,Integer> tgt = new HashMap<Character,Integer>();
        for(int i=0;i<len2;i++){
            char c = target.charAt(i);
            if(tgt.containsKey(c)){
                tgt.put(c,tgt.get(c)+1);
            }else{
                tgt.put(c,1);
            }
        }
        
        // 存放公共字符 
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int left = 0;
        int minLen = len1+1;
        int count =0;
        
        for(int i=0;i<len1;i++){
            char c = source.charAt(i);
            if(tgt.containsKey(c)){
                if(map.containsKey(c)){
                    if(map.get(c)<tgt.get(c)){
                        count++;
                    }
                map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                    count++;
                }
             }
             
            // 说明是一个子串 去除left无效字符
            if(count == len2){
                char sc = source.charAt(left);
                while(!map.containsKey(sc) || map.get(sc) > tgt.get(sc)){
                    if(map.containsKey(sc) && map.get(sc) > tgt.get(sc)){
                        map.put(sc,map.get(sc) - 1);
                    }
                    left++;
                    sc = source.charAt(left);
                }
                // 找到最小子串
                if( i - left + 1 < minLen){
                    result = source.substring(left,i + 1);
                    minLen = i - left + 1;
                }
            }
        }
        return result;
    }