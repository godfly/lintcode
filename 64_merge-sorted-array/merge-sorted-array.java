/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/merge-sorted-array
@Language: Java
@Datetime: 16-11-07 16:00
*/

class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if (A == null || B == null) return;

        int index = m + n - 1;
        while (m > 0 && n > 0) {
            if (A[m - 1] > B[n - 1]) {
                A[index] = A[m - 1];
                m--;
            } else {
                A[index] = B[n - 1];
                n--;
            }
            index--;
        }
        while (n > 0) {
            A[index] = B[n - 1];
            n--;
            index--;
        }
    }
}