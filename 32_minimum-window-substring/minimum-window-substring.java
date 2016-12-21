/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/minimum-window-substring
@Language: Java
@Datetime: 16-10-26 08:35
*/

public class Solution {
    /**
     * @param source: A string
     * @param target: A string
     * @return: A string denote the minimum window
     *          Return "" if there is no such a string
     */
    public String minWindow(String source, String target) {
        // write your code
            int[] srcHash = new int[255];
            for(int i = 0; i < target.length(); i++){
                srcHash[target.charAt(i)]++;
            }
            int start = 0,i= 0;
            int[] destHash = new int[255];
            int found = 0;
            int begin = -1, end = source.length(), minLength = source.length();
            for(start = i = 0; i < source.length(); i++){
                destHash[source.charAt(i)]++;
                if(destHash[source.charAt(i)] <= srcHash[source.charAt(i)]) found++;
                if(found == target.length()){
                    while(start < i && destHash[source.charAt(start)] > srcHash[source.charAt(start)]){
                        destHash[source.charAt(start)]--;
                        start++;
                    }
                    if(i - start < minLength){
                        minLength = i - start;
                        begin = start;
                        end = i;
                    }
                    destHash[source.charAt(start)]--;
                    found--;
                    start++;
                }
            }
            return begin == -1 ? "" : source.substring(begin,end + 1);
    }
}