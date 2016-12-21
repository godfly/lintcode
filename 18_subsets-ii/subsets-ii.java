/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/subsets-ii
@Language: Java
@Datetime: 16-10-22 11:21
*/

class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
                // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();    
        Collections.sort(S);
        backTrack(result, list, S, 0);
        return result;
    }

    private void backTrack(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list, ArrayList<Integer> S, int pos) {
        result.add(new ArrayList(list));

        for (int i = pos; i < S.size(); i++) {
            if(i!=pos && S.get(i-1) == S.get(i)){
                continue;
            }
            list.add(S.get(i));
            backTrack(result, list, S, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
