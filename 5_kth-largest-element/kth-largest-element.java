/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/kth-largest-element
@Language: Java
@Datetime: 16-09-23 08:56
*/

class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        return helper(nums, 0, nums.length - 1, nums.length - k);
    }
    
    public void swap( int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public int helper( int[] nums, int start, int end, int mid) {
        int pivot = end;
        int low = start;
        int high = end;
        while (low < high) {
            while(low < high && nums[low] < nums[pivot]) {
                low++;
            }
            while(low < high && nums[high] >= nums[pivot]) {
                high--;
            }
            swap(nums, low, high);
        }
        swap(nums, low, pivot);
        if (low == mid) {
            return nums[low];
        } else if (low < mid) {
            return helper(nums, low + 1, end, mid);
        } else {
            return helper(nums, start, low - 1, mid);
        }
    }
};