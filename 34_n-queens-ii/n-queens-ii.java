/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/n-queens-ii
@Language: Java
@Datetime: 16-10-27 05:57
*/

class Solution {
    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    public int totalNQueens(int n) {
        //write your code here
        // write your code here
        int[] row = new int[n]; 
        return helper(0 , row, n, 0); 
    }
    
    private int helper(int result,int[] row,int n,int index){
        if( index == n){
            return ++result;
        }
        for(int i=0;i<n;i++){
            if(isValide(row,index,i)){
                row[index] = i;
                result = helper(result,row,n,index+1);
                row[index] = 0;
            }
        }
        return result;
    }
    
    private boolean isValide(int[] row,int rowIndex,int colIndex){
        for(int i=0; i < rowIndex; i++){
            if (row[i] == colIndex ||  (Math.abs(row[i] - colIndex) == Math.abs(i - rowIndex)) )
            {
                return false;
            }
        }
        return true;
    }
};

