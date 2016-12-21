/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/first-position-of-target
@Language: Java
@Datetime: 16-10-24 07:29
*/

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int left = 0,right=nums.length -1;
        int mid= 0;
        while(left < right){
            
            mid = (right + left) / 2; // 可能导致溢出 
            
            if(nums[mid] == target){
                right = mid;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(nums[right] == target)
            return right;
        return -1;
    }
}