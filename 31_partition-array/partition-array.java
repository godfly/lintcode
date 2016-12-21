/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/partition-array
@Language: Java
@Datetime: 16-10-25 12:28
*/

public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
	    int start=0,end=nums.length-1,tmp=0;
        while(end >= start){
            if(nums[start] < k){
                start++;
            }else{
                if(nums[end] < k){
                    tmp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = tmp;
                }else{
                    end--;
                }
            }
        }
        return start;
    }
}