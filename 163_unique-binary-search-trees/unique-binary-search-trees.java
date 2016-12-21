/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/unique-binary-search-trees
@Language: Java
@Datetime: 16-11-19 14:03
*/

public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        int[] count = new int[n+2];
        count[0] = 1;
        count[1] = 1;
        
        for(int i=2;  i<= n; i++){
            for(int j=0; j<i; j++){
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
}