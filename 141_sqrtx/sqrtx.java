/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/sqrtx
@Language: Java
@Datetime: 16-11-08 13:37
*/

class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if( x < 0 )
            return -1;
        if( x == 0)
            return 0;
            
        long lp=1,rp=x;
        long mid =0;
        while(lp+1 < rp){
            mid = (lp + rp)/2;
            if(mid*mid == x){
                return (int)mid;
            }else if(mid*mid < x){
                lp = (int)mid;
            }else{
                rp = (int)mid;
            }
        }
        
        return (int)lp;
    }
}