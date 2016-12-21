/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-array
@Language: Java
@Datetime: 16-11-07 15:50
*/

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null)
            return -1;
        if(nums.length <=1)
            return nums.length;
        
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        
        return index+1;
    }
}