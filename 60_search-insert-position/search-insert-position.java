/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/search-insert-position
@Language: Java
@Datetime: 16-11-17 11:58
*/

public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A.length==0 || A==null) return 0;
        int li=0,ri=A.length-1,mid=0;
        while (li <= ri) {
            mid = (li+ri)/2;
            if (A[mid] == target) return mid;
            else if (A[mid] < target) li = mid+1;
            else ri = mid-1;
        }
        return li;
    }
}
