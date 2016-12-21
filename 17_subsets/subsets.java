/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/subsets
@Language: Java
@Datetime: 16-10-14 14:07
*/

class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        ArrayList<Integer> list = new ArrayList<Integer> ();
        Arrays.sort(nums);
        backTrack(result, list, nums, 0);
        return result;
    }

    private void backTrack(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list, int[] nums, int pos) {
        result.add(new ArrayList(list));

        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            backTrack(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}