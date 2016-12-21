/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/n-queens
@Language: Java
@Datetime: 16-10-27 08:05
*/

class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        int[] row = new int[n];
        helper(result , row, n, 0);
        return result;
    }
    
    void helper(ArrayList<ArrayList<String>> result,int[] row,int n,int index){
        if( index == n){
            ArrayList<String> list = new ArrayList<String>();
            for(int i=0;i<n;i++){
                list.add(toStr(row[i],n));
            }
            result.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            if(isValide(row,index,i)){
                row[index] = i;
                helper(result,row,n,index+1);
                //row[index] = 0;
            }
        }
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
    
    private String toStr(int p, int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i==p?'Q':'.');
        }
        return sb.toString();
    }
};