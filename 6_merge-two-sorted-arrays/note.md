```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/merge-two-sorted-arrays
@Language: Markdown
@Datetime: 16-10-26 06:48
```

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        
        int[] C = new int[A.length+B.length];
        
        int i=0,j=0,n=0;
        
        while(i < A.length || j < B.length){
            if(i == A.length){
                    C[n] = B[j];
                    j++;
                    continue;
            }else if(j == B.length){
                    C[n] = A[i];
                    i++;
                    continue;
            }
            
            if( A[i] < B[j]){
                C[n] = A[i];
                i++;
            }else{
                C[n] = B[j];
                j++;
            }
            n++;
        }
        
        return C;
    }
};