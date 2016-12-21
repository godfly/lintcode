/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/subarray-sum
@Language: Java
@Datetime: 16-11-08 01:19
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(nums == null || nums.length ==0){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            int count = nums[i];
            if(nums[i] == 0){
                result.add(i);
                result.add(i);
                break;
            }
            for(int j=i+1;j<nums.length;j++){
                count += nums[j];
                if(count == 0){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }
}