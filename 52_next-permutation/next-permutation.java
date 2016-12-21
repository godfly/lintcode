/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/next-permutation
@Language: Java
@Datetime: 16-11-22 14:02
*/

public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public static int[] nextPermutation(int[] nums) {
        if (nums.length == 1)
            return nums;
        int k = -1;
        for (int i = nums.length - 1; i >= 1; i--){
            if (nums[i] > nums[i - 1]){
                k = i - 1;
                break;
            }
        }
        
        if (k == -1){
            Arrays.sort(nums);
            return nums;
        }
        
        int smax = nums[k + 1], h = 0;
        for (int i = k + 1; i < nums.length; i++){
            if (nums[i] > nums[k] && nums[i] <= smax){
                smax = nums[i];
                h = i; 
            }
        }
        
        int q = nums[k];
        nums[k] = smax;
        nums[h] = q;
        for (int i = k + 1; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                int p;
                if (nums[i] > nums[j]){
                    p = nums[i];
                    nums[i] = nums[j];
                    nums[j] = p;
                }
            }
        }
        return nums;
    }
}