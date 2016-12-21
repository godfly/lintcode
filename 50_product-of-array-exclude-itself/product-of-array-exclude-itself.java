/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/product-of-array-exclude-itself
@Language: Java
@Datetime: 16-11-08 03:18
*/

public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> arrayList = new ArrayList<>();  
        
        for(int i=0;i<A.size();i++)  
        {  
            long sum = 1;  
            for(int j=0;j<A.size();j++){ 
                if(j != i )  
                    sum *= A.get(j);
            }
            arrayList.add(sum);  
        }  
          
        return arrayList;  
    }
}
