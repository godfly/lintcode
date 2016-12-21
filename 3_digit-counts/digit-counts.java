/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/digit-counts
@Language: Java
@Datetime: 16-09-20 02:58
*/

class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int count=0;
        for(int i=0; i<=n; i++ ){
            int a = i;
            while(a/10 != 0){
                if(a%10 == k){
                    count ++;
                }
                a = a/10;
            }
            if(a == k){
                count++;
            }
        }
        return count;
    }
};
