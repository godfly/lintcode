/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/permutations
@Language: Java
@Datetime: 16-10-26 09:05
*/

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    
    private ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
     
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        
        helper(nums,0,nums.length);
        
        return list;
    }
    
    public void helper(int nums[],int left,int right){
        if(left == right){
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            for(int i=0;i<right;i++){
                arrList.add(nums[i]);
            }
            list.add(arrList);
        }else{
            for(int j=left;j<right;j++){
                //if(is)
                swap(nums,j,left);
                helper(nums,left+1,right);
                swap(nums,j,left);
            }
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int m = nums[i];
        nums[i] = nums[j];
        nums[j] = m;
    }
}
